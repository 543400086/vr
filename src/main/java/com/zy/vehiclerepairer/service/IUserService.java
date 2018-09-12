package com.zy.vehiclerepairer.service;

import com.zy.vehiclerepairer.model.User;

public interface IUserService {
    User selectByUsernameAndPassword(String username, String password);
}
