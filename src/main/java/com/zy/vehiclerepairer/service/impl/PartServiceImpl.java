package com.zy.vehiclerepairer.service.impl;


import com.zy.vehiclerepairer.model.Part;
import com.zy.vehiclerepairer.model.PartPurchase;
import com.zy.vehiclerepairer.service.IPartService;

import java.util.List;
import java.util.Map;

public class PartServiceImpl implements IPartService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Part part) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Part part) {
        return 0;
    }

    @Override
    public List<Part> getList(Map params) {
        return null;
    }

    @Override
    public Part selectByPrimaryKey(Integer id) {
        return null;
    }
}
