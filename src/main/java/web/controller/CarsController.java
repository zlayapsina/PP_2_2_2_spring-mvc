package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller

public class CarsController {
    private final CarDao carDao;

    public CarsController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
       if(count != null) {
           model.addAttribute("cars", carDao.carCount(count));
       } else {
           model.addAttribute("cars", carDao.carList());
       }
        return "cars";
    }
}
