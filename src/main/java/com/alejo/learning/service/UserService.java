package com.alejo.learning.service;

import com.alejo.learning.dao.FakeDataDao;
import com.alejo.learning.dao.UserDao;
import com.alejo.learning.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private UserDao myUserDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.myUserDao = userDao;
    }

    public List<User> getAllUsers() {
        return myUserDao.selectAllUsers();
    }

    public Optional<User> getUser(UUID userUid) {
        return myUserDao.selectUserByUserUid(userUid);
    }

    public int updateUser(User user) {
        Optional<User> optionalUser = getUser(user.getUserUid());
        if(optionalUser.isPresent()){
            myUserDao.updateUser(user);
            return 1;
        }
        return -1;
    }

    public int removeUser(UUID userUid) {
        Optional<User> optionalUser = getUser(userUid);
        if(optionalUser.isPresent()){
            myUserDao.deleteUser(userUid);
            return 1;
        }
        return -1;
    }

    public int insertUser(UUID userUid,  User user) {
        return myUserDao.insertUser(UUID.randomUUID(), user);
    }
}
