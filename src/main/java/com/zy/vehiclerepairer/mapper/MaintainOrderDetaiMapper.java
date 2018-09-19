package com.zy.vehiclerepairer.mapper;

import com.zy.vehiclerepairer.model.MaintainOrderDetai;

public interface MaintainOrderDetaiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MaintainOrderDetai record);

    int insertSelective(MaintainOrderDetai record);

    MaintainOrderDetai selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MaintainOrderDetai record);

    int updateByPrimaryKey(MaintainOrderDetai record);
}