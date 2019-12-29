package com.alejo.learning.service;

import com.alejo.learning.dao.FakeDataDao;
import com.alejo.learning.dao.UserDao;
import com.alejo.learning.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private UserDao myUserDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.myUserDao = userDao;
    }

    public List<User> getAllUsers() {
        return null;
    }

    public User getUser(UUID userUid) {
        return null;
    }

    public int updateUser(User user) {
        return 1;
    }

    public int removeUser(UUID userUid) {
        return 1;
    }

    public int insertUser(UUID userUid,  User user) {
        return 1;
    }
}
