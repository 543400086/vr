package com.zy.vehiclerepairer.service;


import com.zy.vehiclerepairer.model.MaintainOrderDetail;

import java.util.List;
import java.util.Map;

public interface IMaintainOrderDetailService {

    int deleteByPrimaryKey(Integer id);
    int insert(MaintainOrderDetail maintainOrder);
    int updateByPrimaryKeySelective(MaintainOrderDetail maintainOrder);
    List<MaintainOrderDetail> getList(Map params);
    MaintainOrderDetail selectByPrimaryKey(Integer id);
}
