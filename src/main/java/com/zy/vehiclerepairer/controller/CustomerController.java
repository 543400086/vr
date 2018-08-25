package com.zy.vehiclerepairer.controller;

import com.zy.vehiclerepairer.model.Customer;
import com.zy.vehiclerepairer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping("/customer")
    public Customer getCustomer(Integer id){
        return  customerService.selectByPrimaryKey(id);
    }
}
