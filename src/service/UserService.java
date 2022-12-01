package service;

import dao.UserDao;
import model.User;

public interface UserService {

     void userdiKoshuu(User user);
     void idMenenTabuu(int id);

     void idMenenOchuu(int id);
     void baardykUserlerdiAluu();
}
