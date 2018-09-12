package com.zy.vehiclerepairer.controller;

import com.zy.vehiclerepairer.model.User;
import com.zy.vehiclerepairer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        return "login";
    }

    @RequestMapping("/verify")
    public String validLogin(HttpServletRequest request, Model model) {
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

            model.addAttribute("error","用户名密码错误");
            return "login";
        }
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        return "";
    }

    @RequestMapping("/menu")
    public  String menu(){
        return "menu";
    }
}
