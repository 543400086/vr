package com.zy.vehiclerepairer.model;

import java.io.Serializable;
import java.util.Date;

public class MaintainOrderDetai implements Serializable {
    private Integer id;
    /**
     * 订单Id
     */
    private Integer orderId;
    /**
     * 项目id
     */
    private Integer itemId;
    /**
     * 项目名称
     */
    private String itemName;
    /**
     * 类型：1维修项目   2配件
     */
    private Integer itemType;

    private Short buyPrice;

    private Short salePrice;

    private Integer count;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public Short getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Short buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Short getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Short salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}