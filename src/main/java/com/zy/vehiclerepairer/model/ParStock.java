package com.zy.vehiclerepairer.model;

import java.io.Serializable;

/**
 * 配件库存表
 */
public class ParStock implements Serializable {
    private Integer id;
    /**
     * 配件Id
     */
    private Integer partId;
    /**
     * 库存数量
     */
    private Integer count;
    /**
     * 状态：1可销售  0冻结
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}