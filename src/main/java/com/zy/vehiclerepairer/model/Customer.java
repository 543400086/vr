package com.zy.vehiclerepairer.model;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
    private Integer id;

    /**
     * 客户姓名
     */
    private String customerName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 地址
     */
    private String address;
    /**
     * 车型
     */
    private String carType;

    /**
     * 车牌号
     */
    private String plateNumber;
    /**
     * 发动机号
     */
    private String engineNumber;

    private Date datetime;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 购买时间
     */
    private Date buyTime;
    /**
     * 折扣率
     */
    private Integer drivingDistance;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber == null ? null : plateNumber.trim();
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber == null ? null : engineNumber.trim();
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public Integer getDrivingDistance() {
        return drivingDistance;
    }

    public void setDrivingDistance(Integer drivingDistance) {
        this.drivingDistance = drivingDistance;
    }
}