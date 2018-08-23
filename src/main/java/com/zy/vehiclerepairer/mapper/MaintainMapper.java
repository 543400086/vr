package com.zy.vehiclerepairer.mapper;

import com.zy.vehiclerepairer.model.Maintain;

public interface MaintainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Maintain record);

    int insertSelective(Maintain record);

    Maintain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Maintain record);

    int updateByPrimaryKey(Maintain record);
}