package com.zy.vehiclerepairer.model;

import java.io.Serializable;
import java.util.Date;

public class MaintainOrder implements Serializable {
    private Integer id;

    /**
     * 客户Id
     */
    private Integer customerId;

    /**
     * 修改开始时间
     */
    private Date beginTime;
    /**
     * 维修结束时间
     */
    private Date endTime;

    /**
     * 订单总价
     */
    private Short totalPrice;
    /**
     * 折扣
     */
    private Short discount;
    /**
     * 折扣金额
     */
    private Short discountAmount;
    /**
     * 状态：1维修中 2完成 3已结算
     */
    private Integer status;
    /**
     * 维修人
     */
    private String maintainName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Short getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Short totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Short getDiscount() {
        return discount;
    }

    public void setDiscount(Short discount) {
        this.discount = discount;
    }

    public Short getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Short discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMaintainName() {
        return maintainName;
    }

    public void setMaintainName(String maintainName) {
        this.maintainName = maintainName == null ? null : maintainName.trim();
    }
}