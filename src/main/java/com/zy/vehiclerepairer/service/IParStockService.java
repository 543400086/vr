package com.zy.vehiclerepairer.service;

import com.zy.vehiclerepairer.model.ParStock;

import java.util.List;
import java.util.Map;

public interface IParStockService {

    int deleteByPrimaryKey(Integer id);

    int insert(ParStock record);
    int updateByPrimaryKeySelective(ParStock record);
    List<ParStock> getList(Map params);
    ParStock selectByPrimaryKey(Integer id);
}
