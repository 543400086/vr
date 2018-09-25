package com.zy.vehiclerepairer.service;

import com.github.pagehelper.PageInfo;
import com.zy.vehiclerepairer.model.Customer;

import java.util.List;

public interface ICustomerService {
    Customer selectByPrimaryKey(Integer id);

    PageInfo<Customer> getList(String mobile, String plateNumber, Integer page, Integer limit);

    int insert(Customer customer);

    int update(Customer customer);

    /**
     * 根据手机号或车牌号查询
     * @param mobile
     * @param plateNumber
     * @return
     */
    List<Customer> getListByMobileOrPlateNumber(String mobile ,String plateNumber);
}
