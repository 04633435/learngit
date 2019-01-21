package com.example.demo.entity;

import javax.xml.crypto.Data;

public class Parameter {
    private int serialNumber;//序号
    private String billingCategory ;//计费类别
    private String deviceName;//设备名称
    private String quantity;//数量
    private String purchasePrice;//购入价
    private String purchaseDate;//购入日期
    private String baseRate;//基本比率
    private int yearConfficient;//年份系数
    private String accountingRatio;//核算比率
    private String quuote;//报价

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBillingCategory() {
        return billingCategory;
    }

    public void setBillingCategory(String billingCategory) {
        this.billingCategory = billingCategory;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(String baseRate) {
        this.baseRate = baseRate;
    }

    public int getYearConfficient() {
        return yearConfficient;
    }

    public void setYearConfficient(int yearConfficient) {
        this.yearConfficient = yearConfficient;
    }

    public String getAccountingRatio() {
        return accountingRatio;
    }

    public void setAccountingRatio(String accountingRatio) {
        this.accountingRatio = accountingRatio;
    }

    public String getQuuote() {
        return quuote;
    }

    public void setQuuote(String quuote) {
        this.quuote = quuote;
    }




}
