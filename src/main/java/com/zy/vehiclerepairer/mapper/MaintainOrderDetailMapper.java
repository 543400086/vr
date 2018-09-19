package com.zy.vehiclerepairer.mapper;

import com.zy.vehiclerepairer.model.MaintainOrderDetail;

public interface MaintainOrderDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MaintainOrderDetail record);

    int insertSelective(MaintainOrderDetail record);

    MaintainOrderDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MaintainOrderDetail record);

    int updateByPrimaryKey(MaintainOrderDetail record);
}