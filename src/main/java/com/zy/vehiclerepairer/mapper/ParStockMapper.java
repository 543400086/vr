package com.zy.vehiclerepairer.mapper;

import com.zy.vehiclerepairer.model.ParStock;

public interface ParStockMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ParStock record);

    int insertSelective(ParStock record);

    ParStock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ParStock record);

    int updateByPrimaryKey(ParStock record);
}