package com.grk.service.impl;

import com.grk.dao.UserDao;
import com.grk.entity.User;
import com.grk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User addUser(User user) {
        user.setVuStatus(1);
        userDao.insertUser(user);
        return user;
    }

    @Override
    public User getUserByUserName(String username, String password) {
        User user = userDao.selectUserByUsername(username);
        if (user == null)
            return null;
        if (!user.getVuPassword().equals(password))
            return null;
        return user;
    }

}
