package com.zy.vehiclerepairer.model;

import java.io.Serializable;

/**
 * @author zhangshugui
 * 汽车修理单
 */
public class RepairOrderModel implements Serializable{
    private int id;
    private int carRegisterId;
    private String project;
    private int jobNumber;
    private String sendWorkers;
    private int ComponentId;
    private int count;
    private double hour;
    private String completeDate;
    private String repairman;
    private String manager;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarRegisterId() {
        return carRegisterId;
    }

    public void setCarRegisterId(int carRegisterId) {
        this.carRegisterId = carRegisterId;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(int jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getSendWorkers() {
        return sendWorkers;
    }

    public void setSendWorkers(String sendWorkers) {
        this.sendWorkers = sendWorkers;
    }

    public int getComponentId() {
        return ComponentId;
    }

    public void setComponentId(int componentId) {
        ComponentId = componentId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public String getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(String completeDate) {
        this.completeDate = completeDate;
    }

    public String getRepairman() {
        return repairman;
    }

    public void setRepairman(String repairman) {
        this.repairman = repairman;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
