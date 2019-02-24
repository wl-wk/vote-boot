package com.grk.service;

import com.grk.entity.User;

public interface UserService {

    User getUserByUserName(String username, String password);

    User addUser(User user);


}
