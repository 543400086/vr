package com.zy.vehiclerepairer.model;

import java.io.Serializable;

public class MaintainProject implements Serializable {
    private Integer id;
    /**
     * 修改名称
     */
    private String projectName;
    /**
     * 计费单位
     */
    private String chargeUnit;
    /**
     *车型
     */
    private String carType;
    /**
     *工时费
     */
    private Integer timeFee;
    /**
     * 保修期限
     */
    private Integer guaranteeTime;
    /**
     * 备注
     */
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