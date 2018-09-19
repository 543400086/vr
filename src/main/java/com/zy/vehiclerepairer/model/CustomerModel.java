package com.zy.vehiclerepairer.model;

import java.io.Serializable;

/**
 * @author zhangshugui
 * 修车登记表
 */
public class CustomerModel implements Serializable {
    private int id;
    private String name;
    private String moble;
    /**
     * 地址
     */
    private String address;
    /**
     * 车型
     */
    private String type;
    /**
     * 车牌号
     */
    private String plateNumber;
    /**
     * 发动机号
     */
    private String engineNumber;
    private String datetime;
    private String createBy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoble() {
        return moble;
    }

    public void setMoble(String moble) {
        this.moble = moble;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
