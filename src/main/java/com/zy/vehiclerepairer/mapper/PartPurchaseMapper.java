package com.zy.vehiclerepairer.mapper;

import com.zy.vehiclerepairer.model.PartPurchase;

public interface PartPurchaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PartPurchase record);

    int insertSelective(PartPurchase record);

    PartPurchase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PartPurchase record);

    int updateByPrimaryKey(PartPurchase record);
}