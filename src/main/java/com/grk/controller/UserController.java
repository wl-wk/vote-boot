package com.grk.controller;

import com.grk.entity.User;
import com.grk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public Object login(String username, String password, HttpSession sess) {
        User user = userService.getUserByUserName(username, password);
        System.out.println("adf" + user);
        if (user == null)
            return "redirect:/login.jsp";
        else {
            sess.setAttribute("user", user);
            return "redirect:/index.jsp";
        }

    }

    @RequestMapping("register")
    public String register(User user, HttpSession sess) {
        userService.addUser(user);
        if (user.getVuUserId() != null) {
            sess.setAttribute("user", user);
            return "redirect:/reg_success.jsp";
        }

        return "redirect:/register.jsp";

    }


}
