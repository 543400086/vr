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

}
