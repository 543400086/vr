package com.zy.vehiclerepairer.mapper;

import com.zy.vehiclerepairer.model.ComponentRecipientsModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ComponentRecipientsMapper {
    /**
     * 分页查询
     * 根据条件获取
     *
     * @return
     */
    List<ComponentRecipientsModel> getCarList(@Param("componentId") int componentId,
                                              @Param("repairId") int repairId,
                                              @Param("manager") String manager,
                                              @Param("pageIndex") int pageIndex,
                                              @Param("pageSize") int pageSize);

    /**
     * 插入零件领用
     *
     * @param ComponentRecipientsModel
     * @return
     */
    @Insert("INSERT INTO ComponentRecipients(componentId,repairId,count,createTime,manager)" +
            "VALUES(#{componentId},#{repairId},#{count},#{createTime},#{manager}})")
    int insert(ComponentRecipientsModel ComponentRecipientsModel);

    /**
     * 修改零件领用表
     *
     * @param ComponentRecipientsModel
     * @return
     */
    @Update("UPDATE ComponentRecipients SET componentId=#{componentId},repairId=#{repairId},count=#{count},manager=#{manager} " +
            "WHERE id=#{id}")
    int update(ComponentRecipientsModel ComponentRecipientsModel);

    /**
     * 根据Id获取零件领用
     *
     * @param id
     * @return
     */
    @Select("SELECT id,componentId,repairId,count,createTime,manager " +
            "WHERE id=#{id}")
    ComponentRecipientsModel get(int id);
}
