package com.zy.vehiclerepairer.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 配件采购流水表
 */
public class PartPurchase implements Serializable {
    private Integer id;
    /**
     * 流水号
     */
    private String purchaseNumber;
    /**
     * 配件Id
     */
    private Integer partId;
    /**
     * 进货价
     */
    private Long buyPrice;
    /**
     * 销售价
     */
    private Long salePrice;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(String purchaseNumber) {
        this.purchaseNumber = purchaseNumber == null ? null : purchaseNumber.trim();
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public Long getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Long buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}