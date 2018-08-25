package com.zy.vehiclerepairer.mapper;

import com.zy.vehiclerepairer.model.Part;

public interface PartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Part record);

    int insertSelective(Part record);

    Part selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Part record);

    int updateByPrimaryKey(Part record);
}