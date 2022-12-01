package impl;

import dao.UserDao;
import model.MyExseption;
import model.User;
import service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDao();

    @Override
    public void userdiKoshuu(User user) {
        userDao.getUsers().add(user);
    }

    @Override
    public void idMenenTabuu(int id) {
        User user = userDao.getUsers().stream().filter(c -> c.getId() == id).findFirst().orElseThrow(() -> new MyExseption("Мындай id жок"));
        System.out.println(user);
    }

    @Override
    public void idMenenOchuu(int id) {
       // User user = userDao.getUsers().stream().filter(c -> c.getId() == id).findFirst().orElseThrow(() -> new MyExseption("Мындай id жок"));
        User user = userDao.getUsers().stream().filter(s -> s.getId() == id).findFirst().get();
        userDao.getUsers().remove(user);
    }

    @Override
    public void baardykUserlerdiAluu() {
        System.out.println(userDao.getUsers());
    }
}
