package com.alejo.learning.dao;

import com.alejo.learning.model.User;

import java.util.List;
import java.util.UUID;

public interface UserDao {
    List<User> selectAllUsers();
    User selectUserByUserUid(UUID userUid);
    int updateUser(User user);
    int deleteUser(UUID userUid);
    int insertUser(UUID userUid, User user);
}
