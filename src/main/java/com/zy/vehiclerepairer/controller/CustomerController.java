package com.zy.vehiclerepairer.controller;

import com.zy.vehiclerepairer.model.Customer;
import com.zy.vehiclerepairer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService  customerService;
    @RequestMapping("/customer")
    public Customer getCustomer(Integer id){
        return  customerService.selectByPrimaryKey(id);
    }

    @RequestMapping("/list")
    public List<Customer> getList(){
        return customerService.getList("","",0,10);
    }
}
