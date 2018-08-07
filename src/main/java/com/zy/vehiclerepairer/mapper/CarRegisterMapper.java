package com.zy.vehiclerepairer.mapper;

import com.zy.vehiclerepairer.dynamicsql.CarRegisterProvider;
import com.zy.vehiclerepairer.model.CarRegisterModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CarRegisterMapper {
    /**
     * 分页查询
     * 根据条件获取
     *
     * @return
     */
    @SelectProvider(type = CarRegisterProvider.class, method = "listCarRegister")
    List<CarRegisterModel> getCarList(@Param("name") String name,
                                      @Param("mark") String mark,
                                      @Param("mobile") String mobile,
                                      @Param("pageIndex") int pageIndex,
                                      @Param("pageSize") int pageSize);

    /**
     * 插入修车登记表
     *
     * @param carRegisterModel
     * @return
     */
    @Insert("INSERT INTO CarRegister(mark,type,factory,name,mobile,address,createTime,createBy)" +
            "VALUES(#{mark},#{type},#{factory},#{name},#{mobile},#{address},#{createTime}::timestamp,#{createBy})")
    int insert(CarRegisterModel carRegisterModel);

    /**
     * 修改修车登记表
     *
     * @param carRegisterModel
     * @return
     */
    @Update("UPDATE CarRegister SET mark=#{mark},type=#{type},factory=#{factory}," +
            "name=#{name},mobile=#{mobile},address=#{address} " +
            "WHERE id=#{id}")
    int update(CarRegisterModel carRegisterModel);

    /**
     * 根据Id获取登记信息
     *
     * @param id
     * @return
     */
    @Select("SELECT id,mark,type,factory,name,mobile,address,createTime,createBy FROM CarRegister " +
            "WHERE id=#{id}")
    CarRegisterModel get(int id);
}
