package com.zy.vehiclerepairer.controller;

import com.github.pagehelper.PageInfo;
import com.zy.vehiclerepairer.model.Customer;
import com.zy.vehiclerepairer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @RequestMapping("/get")
    public Customer getCustomer(Integer id) {
        return customerService.selectByPrimaryKey(id);
    }

    @RequestMapping("/index")
    public String getList(@RequestParam(value = "page", defaultValue = "1") int page,
                          @RequestParam(value = "limit", defaultValue = "3") int limit,
                          HttpServletRequest request,
                          Model model) {

        PageInfo<Customer> contentsPaginator = customerService.getList("", "", page, limit);
        model.addAttribute("customers", contentsPaginator);
        return "customer/list";
    }


    @RequestMapping(value = "add")
    public boolean add(Customer customer, HttpServletRequest request) {
        return customerService.insert(customer) > 0 ? true : false;
    }


    @RequestMapping(value = "update")
    public boolean update(Customer customer, HttpServletRequest request) {
        return customerService.update(customer) > 0 ? true : false;
    }
}
