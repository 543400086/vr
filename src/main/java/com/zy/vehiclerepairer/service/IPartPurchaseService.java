package com.zy.vehiclerepairer.service;


import com.zy.vehiclerepairer.model.PartPurchase;

import java.util.List;
import java.util.Map;

public interface IPartPurchaseService {


    int deleteByPrimaryKey(Integer id);

    int insert(PartPurchase partPurchase);
    int updateByPrimaryKeySelective(PartPurchase partPurchase);
    List<PartPurchase> getList(Map params);
    PartPurchase selectByPrimaryKey(Integer id);
}
