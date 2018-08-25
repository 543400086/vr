package com.zy.vehiclerepairer.service;

import com.zy.vehiclerepairer.mapper.CustomerMapper;
import com.zy.vehiclerepairer.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerService {
    @Autowired
    private static Logger logger = LoggerFactory.getLogger(CustomerService.class);
    @Autowired
    private CustomerMapper customerMapper;

    public Customer selectByPrimaryKey(Integer id) {
        Customer customer = null;
        try {
            customer = customerMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            logger.error(String.format("获取客户信息失败，错误信息%s", e));
        }
        return customer;
    }
}
