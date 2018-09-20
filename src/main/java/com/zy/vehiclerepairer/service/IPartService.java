package com.zy.vehiclerepairer.service;

import com.zy.vehiclerepairer.model.Part;

import java.util.List;
import java.util.Map;

public interface IPartService {
    int deleteByPrimaryKey(Integer id);
    int insert(Part part);
    int updateByPrimaryKeySelective(Part part);
    List<Part> getList(Map params);
    Part selectByPrimaryKey(Integer id);

}
