package com.zy.vehiclerepairer.service;

import com.zy.vehiclerepairer.model.MaintainProject;

import java.util.List;
import java.util.Map;

public interface IMaintainProjectService {
    int deleteByPrimaryKey(Integer id);
    int insert(MaintainProject maintainProject);
    int updateByPrimaryKeySelective(MaintainProject maintainProject);
    List<MaintainProject> getList(Map params);
    MaintainProject selectByPrimaryKey(Integer id);
}
