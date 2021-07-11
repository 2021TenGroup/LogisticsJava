package com.logistics.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (FiPaymentGoods)实体类
 *
 * @author makejava
 * @since 2021-07-12 01:21:44
 */
public class FiPaymentGoods implements Serializable {
    private static final long serialVersionUID = -26175775278866319L;

    private Integer pgId;

    private Integer waybillId;

    private Double pgPayment;

    private Double pgServiceMoney;

    private Double pgActualMoney;

    private Integer outletsId1;

    private Integer empId;

    private Integer outletsId2;

    private String sender;

    private String senderPhone;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;


    public Integer getPgId() {
        return pgId;
    }

    public void setPgId(Integer pgId) {
        this.pgId = pgId;
    }

    public Integer getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Integer waybillId) {
        this.waybillId = waybillId;
    }

    public Double getPgPayment() {
        return pgPayment;
    }

    public void setPgPayment(Double pgPayment) {
        this.pgPayment = pgPayment;
    }

    public Double getPgServiceMoney() {
        return pgServiceMoney;
    }

    public void setPgServiceMoney(Double pgServiceMoney) {
        this.pgServiceMoney = pgServiceMoney;
    }

    public Double getPgActualMoney() {
        return pgActualMoney;
    }

    public void setPgActualMoney(Double pgActualMoney) {
        this.pgActualMoney = pgActualMoney;
    }

    public Integer getOutletsId1() {
        return outletsId1;
    }

    public void setOutletsId1(Integer outletsId1) {
        this.outletsId1 = outletsId1;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getOutletsId2() {
        return outletsId2;
    }

    public void setOutletsId2(Integer outletsId2) {
        this.outletsId2 = outletsId2;
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
