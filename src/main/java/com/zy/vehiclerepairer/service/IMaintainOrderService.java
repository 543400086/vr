package com.zy.vehiclerepairer.service;

import com.zy.vehiclerepairer.model.MaintainOrder;

import java.util.List;
import java.util.Map;

public interface IMaintainOrderService {

    int deleteByPrimaryKey(Integer id);
    int insert(MaintainOrder maintainOrder);
    int updateByPrimaryKeySelective(MaintainOrder maintainOrder);
    List<MaintainOrder> getList(Map params);
    MaintainOrder selectByPrimaryKey(Integer id);
}
