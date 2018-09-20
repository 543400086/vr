package com.zy.vehiclerepairer.service;

import com.zy.vehiclerepairer.model.PartStock;

import java.util.List;
import java.util.Map;

public interface IParStockService {

    int deleteByPrimaryKey(Integer id);

    int insert(PartStock record);
    int updateByPrimaryKeySelective(PartStock record);
    List<PartStock> getList(Map params);
    PartStock selectByPrimaryKey(Integer id);
}
