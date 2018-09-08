package com.zy.vehiclerepairer.service;

import com.zy.vehiclerepairer.mapper.UserMapper;
import com.zy.vehiclerepairer.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private static Logger logger = LoggerFactory.getLogger(CustomerService.class);
    @Autowired
    private UserMapper userMapper;

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    public User selectByUsernameAndPassword(String username, String password) {
        User user = null;
        try {
            user = userMapper.selectByUsernameAndPassword(username, password);
        } catch (Exception e) {
            logger.error(String.format("获取客户信息失败，错误信息%s", e));
        }
        return user;
    }
}
