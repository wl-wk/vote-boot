package com.grk.controller;

import com.grk.entity.User;
import com.grk.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;


    @RequestMapping("addItem")
    public String register(HttpServletRequest req, HttpSession sess, Integer vsId, Integer[] voId) {

        Object user = sess.getAttribute("user");
        if (user == null)
            return "redirect:/login.jsp";
        User u = (User) user;
        boolean mark = itemService.addItem(u.getVuUserId(), vsId, voId);
        if (mark) {
            req.setAttribute("mess", "恭喜：投票成功！");
        } else {
            req.setAttribute("mess", "失败，因为已经为这个投过票，不能再次的投票！");
        }
        req.setAttribute("vsId", vsId);

        return "forward:/vote_success.jsp";

    }


}
