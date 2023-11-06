package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
public class UsersController {
    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String printUser(ModelMap model) {
        model.addAttribute("users", userService.getUsers());
        return "users";
    }

    @GetMapping(value = "/new")
    public String newUserPage(ModelMap model) {
        model.addAttribute("user", new User());
        return "new";
    }

    @PostMapping("/new")
    public String newUser(@ModelAttribute("user") User user) {
        userService.saveUser(user.getName(), user.getSurname(), user.getAge());
        return "redirect:/";
    }

    @GetMapping(value = "/edit")
    public String editPage(@RequestParam("id") int id, ModelMap model) {
        System.out.println("in:"+userService.showId(id).getId());
        model.addAttribute("user", userService.showId(id));
        return "/edit";
    }

    @PostMapping("/edit")
    public String editUser(@ModelAttribute("user") User user,
                           @RequestParam("id") int id) {
        System.out.println("out id:"+user.getId());
        System.out.println("in id:" + id);
        userService.editUser(id, user);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteUser() {

        return "redirect:/";
    }

}
