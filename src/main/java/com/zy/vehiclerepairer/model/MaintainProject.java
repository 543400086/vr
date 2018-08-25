package com.zy.vehiclerepairer.model;

import java.io.Serializable;

public class MaintainProject implements Serializable {
    private Integer id;

    private String projectName;

    private String chargeUnit;

    private String carType;

    private Integer timeFee;

    private Integer guaranteeTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getChargeUnit() {
        return chargeUnit;
    }

    public void setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit == null ? null : chargeUnit.trim();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public Integer getTimeFee() {
        return timeFee;
    }

    public void setTimeFee(Integer timeFee) {
        this.timeFee = timeFee;
    }

    public Integer getGuaranteeTime() {
        return guaranteeTime;
    }

    public void setGuaranteeTime(Integer guaranteeTime) {
        this.guaranteeTime = guaranteeTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}