package com.zy.vehiclerepairer.mapper;

import com.zy.vehiclerepairer.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shugui.zhang 2018/7/9 14:18
 */
@Mapper
public interface UserMapper{

//    @Select("select * from user where userid=#{id}")
//    User selectById(Integer id);

    User selectById(Integer id);
}
