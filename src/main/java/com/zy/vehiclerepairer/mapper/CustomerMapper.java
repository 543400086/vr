package com.zy.vehiclerepairer.mapper;

import com.zy.vehiclerepairer.dynamicsql.CustomerProvider;
import com.zy.vehiclerepairer.model.CustomerModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CustomerMapper {
    /**
     * 分页查询
     * 根据条件获取
     *
     * @return
     */
    @SelectProvider(type = CustomerProvider.class, method = "listCarRegister")
    List<CustomerModel> getCarList(@Param("name") String name,
                                   @Param("mobile") String mobile,
                                   @Param("plateNumber") String plateNumber);

    /**
     * 插入修车登记表
     *
     * @param carRegisterModel
     * @return
     */
    @Insert("INSERT INTO Customer(name,mobile,address,type,plateNumber,engineNumber,createTime,createBy)" +
            "VALUES(#{name},#{mobile},#{address},#{type},#{plateNumber},#{engineNumber},#{createTime}::timestamp,#{createBy})")
    int insert(CustomerModel carRegisterModel);

    /**
     * 修改修车登记表
     *
     * @param carRegisterModel
     * @return
     */
    @Update("UPDATE CarRegister SET mark=#{mark},type=#{type},factory=#{factory}," +
            "name=#{name},mobile=#{mobile},address=#{address} " +
            "WHERE id=#{id}")
    int update(CustomerModel carRegisterModel);

    /**
     * 根据Id获取登记信息
     *
     * @param id
     * @return
     */
    @Select("SELECT id,mark,type,factory,name,mobile,address,createTime,createBy FROM CarRegister " +
            "WHERE id=#{id}")
    CustomerModel get(int id);
}
