package com.grk.dao;

import com.grk.entity.User;

public interface UserDao {
    User selectUserByUsername(String username);

    void insertUser(User user);


}
