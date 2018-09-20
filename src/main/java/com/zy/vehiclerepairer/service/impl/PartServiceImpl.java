package com.zy.vehiclerepairer.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zy.vehiclerepairer.mapper.PartMapper;
import com.zy.vehiclerepairer.model.Part;
import com.zy.vehiclerepairer.model.PartPurchase;
import com.zy.vehiclerepairer.service.IPartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class PartServiceImpl implements IPartService {
    @Autowired
    private  PartMapper partMapper;
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
       PageHelper.startPage((int) params.get("page"), (int) params.get("limit"));
        List<Part> partList = partMapper.getList(params);
        return partList;
    }

    @Override
    public Part selectByPrimaryKey(Integer id) {
        return null;
    }
}
