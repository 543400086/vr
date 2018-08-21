package com.zy.vehiclerepairer.service;

import com.zy.vehiclerepairer.mapper.CustomerMapper;
import com.zy.vehiclerepairer.model.CustomerModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarRegisterService {
    private static Logger logger = LoggerFactory.getLogger(CarRegisterService.class);
    @Autowired
    private CustomerMapper customerMapper;

    public List<CustomerModel> getCustomerList(String name,
                                               String mobile,
                                               String plateNumber) {
        List<CustomerModel> customerModelList = null;
        try {
            customerModelList = customerMapper.getCarList(name, mobile, plateNumber);
        } catch (Exception e) {
            logger.error(String.format("获取客户信息失败，错误信息%s", e));
        }
        return customerModelList;
    }
}
