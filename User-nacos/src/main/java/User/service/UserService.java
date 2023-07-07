package User.service;


import User.dao.UserDao;
import User.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public List<User> getAll(){
       return userDao.getAll();
    }

    public void add(User user) {
         userDao.InsertUser(user);
    }

    public void remove(int id) {
         userDao.deleteUserById(id);
    }
    public User getUser(int id) {

        return userDao.getUserById(id);
    }
    public int update  (int id){
        return  userDao.updateUserById( id);
    }

    public int insert(User user) {
        return userDao.InsertUser(user);
    }
}
