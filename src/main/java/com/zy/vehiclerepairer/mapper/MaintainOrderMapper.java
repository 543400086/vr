package com.zy.vehiclerepairer.mapper;

import com.zy.vehiclerepairer.model.MaintainOrder;

public interface MaintainOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MaintainOrder record);

    int insertSelective(MaintainOrder record);

    MaintainOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MaintainOrder record);

    int updateByPrimaryKey(MaintainOrder record);
}