package com.zy.vehiclerepairer.mapper;

import com.zy.vehiclerepairer.model.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);
    int updateByPrimaryKeySelective(Customer record);
    List<Customer> getList(Map params);
    Customer selectByPrimaryKey(Integer id);

    int insertSelective(Customer record);



    int updateByPrimaryKey(Customer record);


    /**
     * 根据手机号或车牌号查询
     * @param mobile
     * @param plateNumber
     * @return
     */
    List<Customer> getListByMobileOrPlateNumber(String mobile ,String plateNumber);
}