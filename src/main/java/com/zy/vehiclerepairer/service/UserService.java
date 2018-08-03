package com.zy.vehiclerepairer.service;

import com.zy.vehiclerepairer.domain.mapper.UserMapper;
import com.zy.vehiclerepairer.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shugui.zhang 2018/7/9 14:15
 */
@Service
public class UserService{

    @Autowired
    private UserMapper userMapper;

    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

}
