package com.zy.vehiclerepairer.mapper;

import com.zy.vehiclerepairer.model.PartStock;

public interface PartStockMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PartStock record);

    int insertSelective(PartStock record);

    PartStock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PartStock record);

    int updateByPrimaryKey(PartStock record);
}