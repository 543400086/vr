package com.zy.vehiclerepairer.controller;

import com.zy.vehiclerepairer.model.User;
import com.zy.vehiclerepairer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        return "login";
    }

    @RequestMapping("/verify")
    public String validLogin(HttpServletRequest request) {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        User user = null;
        if (!"".equals(userName) && !"".equals(password)) {
            user = userService.selectByUsernameAndPassword(userName, password);
        }
        String str = "";
        if (user != null) {
            return "index";
        } else {
            return "login";
        }
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        return "";
    }
}
