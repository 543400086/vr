package com.zy.vehiclerepairer.controller;

import com.zy.vehiclerepairer.model.CustomerModel;
import com.zy.vehiclerepairer.service.CarRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarRegisterController {
    @Autowired
    private CarRegisterService carRegisterService;
    @RequestMapping("/customer")
    public List<CustomerModel> getCustomer(String name,
                                           String mobile,
                                           String plateNumber){
        return  carRegisterService.getCustomerList(name,mobile,plateNumber);
    }
}
