package com.zy.vehiclerepairer.controller;

import com.zy.vehiclerepairer.domain.model.User;
import com.zy.vehiclerepairer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shugui.zhang 2018/7/9 14:20
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public User selectById(int id){
        return userService.selectById(id);
    }
}
