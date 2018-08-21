package com.zy.vehiclerepairer.model;

/**
 * 商品表
 */
public class GoodsModel {
    private int id;
    private String Name;
    /**
     * 单位
     */
    private String unit;
    /**
     * 规格
     */
    private String standard;
    /**
     * 供应商
     */
    private String supplier;
    /**
     * 产地
     */
    private String location;
    /**
     * 有效期
     */
    private int validTime;
    /**
     * 通用车型
     */
    private String generalType;
    /**
     * 进货价
     */
    private  double buyPrice;
    /**
     * 销售价
     */
    private double SalePrice;

}
