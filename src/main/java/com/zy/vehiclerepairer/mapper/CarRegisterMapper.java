package com.zy.vehiclerepairer.mapper;

import com.zy.vehiclerepairer.model.CarRegisterModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CarRegisterMapper {
    @Select("select * from CarRegister")
    List<CarRegisterModel> getCarList();
}
