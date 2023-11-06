package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();
    void saveUser(String name, String surname, int age);
    void removeUser(User user);
    void editUser(int id, User user);
    User showId(int id);
}
