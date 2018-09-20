package com.zy.vehiclerepairer.mapper;

import com.github.pagehelper.PageInfo;
import com.zy.vehiclerepairer.model.Part;

import java.util.List;
import java.util.Map;

public interface PartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Part record);

    int insertSelective(Part record);

    Part selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Part record);

    int updateByPrimaryKey(Part record);

    List<Part> getList(Map params);
}