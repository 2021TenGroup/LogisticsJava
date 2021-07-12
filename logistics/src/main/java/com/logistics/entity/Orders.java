package com.logistics.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Orders)实体类
 *
 * @author makejava
 * @since 2021-07-12 11:56:53
 */
public class Orders implements Serializable {
    private static final long serialVersionUID = -27453801506076629L;
    
    private Integer oId;
    
    private Integer outletsId;
    
    private Integer goodId;
    
    private Integer empId;
    
    private Integer customerId;
    
    private Integer dsGoodsId;
    
    private Integer expressType;
    
    private String sender;
    
    private String senderPhone;
    
    private String postcode;
    
    private String province;
    
    private String city;
    
    private String region;
    
    private String mailingAddress;
    
    private String addressee;
    
    private String aPhone;
    
    private String receivingCode;
    
    private String receivingAddress;
    
    private Integer orderSource;
    
    private Integer state;
    
    private Date oTime;
    
    private Integer paymentMethod;
    
    private Double serviceCharge;
    
    private Double paymentForGoods;
    
    private Double freight;
    
    private Double totalRates;
    
    private String addname;
    
    private Date addtime;
    
    private String updatename;
    
    private Date updatetime;
    
    private String deletename;
    
    private Date deletetime;
    
    private Integer timeliness;


    public Integer getOId() {
        return oId;
    }

    public void setOId(Integer oId) {
        this.oId = oId;
    }

    public Integer getOutletsId() {
        return outletsId;
    }

    public void setOutletsId(Integer outletsId) {
        this.outletsId = outletsId;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getDsGoodsId() {
        return dsGoodsId;
    }

    public void setDsGoodsId(Integer dsGoodsId) {
        this.dsGoodsId = dsGoodsId;
    }

    public Integer getExpressType() {
        return expressType;
    }

    public void setExpressType(Integer expressType) {
        this.expressType = expressType;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getAPhone() {
        return aPhone;
    }

    public void setAPhone(String aPhone) {
        this.aPhone = aPhone;
    }

    public String getReceivingCode() {
        return receivingCode;
    }

    public void setReceivingCode(String receivingCode) {
        this.receivingCode = receivingCode;
    }

    public String getReceivingAddress() {
        return receivingAddress;
    }

    public void setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getOTime() {
        return oTime;
    }

    public void setOTime(Date oTime) {
        this.oTime = oTime;
    }

    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Double getPaymentForGoods() {
        return paymentForGoods;
    }

    public void setPaymentForGoods(Double paymentForGoods) {
        this.paymentForGoods = paymentForGoods;
    }

    public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
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