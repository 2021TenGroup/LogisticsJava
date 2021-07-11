package com.logistics.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (DsWaybillEntrt)实体类
 *
 * @author makejava
 * @since 2021-07-11 20:06:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DsWaybillEntrt implements Serializable {
    private static final long serialVersionUID = -34563257702479268L;
    
    private Integer waybillId;
    
    private Integer ordersId;
    
    private Integer empId;
    
    private String waybillNumber;
    
    private String outletsId1;
    
    private Integer expressType;
    
    private Integer outletsId;
    
    private String notes;
    
    private Double serviceCharge;
    
    private Double paymentGoods;
    
    private Double ratesS;
    
    private Double totalRates;
    
    private String addname;
    
    private Date addtime;
    
    private String updatename;
    
    private Date updatetime;
    
    private String deletename;
    
    private Date deletetime;
    
    private Integer timeliness;


    public Integer getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Integer waybillId) {
        this.waybillId = waybillId;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillNumber(String waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public String getOutletsId1() {
        return outletsId1;
    }

    public void setOutletsId1(String outletsId1) {
        this.outletsId1 = outletsId1;
    }

    public Integer getExpressType() {
        return expressType;
    }

    public void setExpressType(Integer expressType) {
        this.expressType = expressType;
    }

    public Integer getOutletsId() {
        return outletsId;
    }

    public void setOutletsId(Integer outletsId) {
        this.outletsId = outletsId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Double getPaymentGoods() {
        return paymentGoods;
    }

    public void setPaymentGoods(Double paymentGoods) {
        this.paymentGoods = paymentGoods;
    }

    public Double getRatesS() {
        return ratesS;
    }

    public void setRatesS(Double ratesS) {
        this.ratesS = ratesS;
    }

    public Double getTotalRates() {
        return totalRates;
    }

    public void setTotalRates(Double totalRates) {
        this.totalRates = totalRates;
    }

    public String getAddname() {
        return addname;
    }

    public void setAddname(String addname) {
        this.addname = addname;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getUpdatename() {
        return updatename;
    }

    public void setUpdatename(String updatename) {
        this.updatename = updatename;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getDeletename() {
        return deletename;
    }

    public void setDeletename(String deletename) {
        this.deletename = deletename;
    }

    public Date getDeletetime() {
        return deletetime;
    }

    public void setDeletetime(Date deletetime) {
        this.deletetime = deletetime;
    }

    public Integer getTimeliness() {
        return timeliness;
    }

    public void setTimeliness(Integer timeliness) {
        this.timeliness = timeliness;
    }

}