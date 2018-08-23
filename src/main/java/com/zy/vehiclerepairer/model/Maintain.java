package com.zy.vehiclerepairer.model;

import java.io.Serializable;
import java.util.Date;

public class Maintain implements Serializable {
    private Integer id;

    private Integer customerId;

    private Integer projctId;

    private Integer partId;

    private Date beginTime;

    private Date endTime;

    private Short totalPrice;

    private Short discount;

    private Short discountAmount;

    private Integer status;

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

    public Integer getProjctId() {
        return projctId;
    }

    public void setProjctId(Integer projctId) {
        this.projctId = projctId;
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
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