package com.zy.vehiclerepairer.mapper;

import com.zy.vehiclerepairer.model.MaintainProject;

public interface MaintainProjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MaintainProject record);

    int insertSelective(MaintainProject record);

    MaintainProject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MaintainProject record);

    int updateByPrimaryKey(MaintainProject record);
}