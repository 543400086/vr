package com.zy.vehiclerepairer.mapper;
 
import com.zy.vehiclerepairer.model.ComponentStorageModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ComponentStorageMapper {
    /**
     * 分页查询
     * 根据条件获取
     *
     * @return
     */
    List<ComponentStorageModel> getComponentStorageList( @Param("name") String name,
                                           @Param("manager") String manager,
                                           @Param("pageIndex") int pageIndex,
                                           @Param("pageSize") int pageSize);

    /**
     * 插入零件入库
     *
     * @param ComponentStorageModel
     * @return
     */
    @Insert("INSERT INTO ComponentStorage(name,price,count,salesPrice,createTime,checkPerson,manager)" +
            "VALUES(#{name},#{price},#{count},#{salesPrice},#{createTime},#{checkPerson},#{manager}})")
    int insert(ComponentStorageModel ComponentStorageModel);

    /**
     * 修改零件入库
     *
     * @param ComponentStorageModel
     * @return
     */
    @Update("UPDATE ComponentStorage SET name=#{name},price=#{price},count=#{count},salesPrice=#{salesPrice} " +
            "WHERE id=#{id}")
    int update(ComponentStorageModel ComponentStorageModel);

    /**
     * 根据Id获取零件入库
     *
     * @param id
     * @return
     */
    @Select("SELECT id,name,price,count,salesPrice,createTime,checkPerson,manager " +
            "WHERE id=#{id}")
    ComponentStorageModel get(int id);
}
