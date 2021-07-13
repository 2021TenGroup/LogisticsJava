package com.logistics.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Outlets)实体类
 *
 * @author makejava
 * @since 2021-07-13 04:36:31
 */
public class Outlets implements Serializable {
    private static final long serialVersionUID = -90485114195598503L;

    private Integer outletsId;

    private String outletsNumber;

    private String outletsName;

    private Integer outletsBelonging;

    private String outletsPerson;

    private Integer outletsPhone;

    private String outletsProvince;

    private String outletsCity;

    private String outletsRegion;

    private String outletsAddress;

    private String outletsRemarks;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;


    public Integer getOutletsId() {
        return outletsId;
    }

    public void setOutletsId(Integer outletsId) {
        this.outletsId = outletsId;
    }

    public String getOutletsNumber() {
        return outletsNumber;
    }

    public void setOutletsNumber(String outletsNumber) {
        this.outletsNumber = outletsNumber;
    }

    public String getOutletsName() {
        return outletsName;
    }

    public void setOutletsName(String outletsName) {
        this.outletsName = outletsName;
    }

    public Integer getOutletsBelonging() {
        return outletsBelonging;
    }

    public void setOutletsBelonging(Integer outletsBelonging) {
        this.outletsBelonging = outletsBelonging;
    }

    public String getOutletsPerson() {
        return outletsPerson;
    }

    public void setOutletsPerson(String outletsPerson) {
        this.outletsPerson = outletsPerson;
    }

    public Integer getOutletsPhone() {
        return outletsPhone;
    }

    public void setOutletsPhone(Integer outletsPhone) {
        this.outletsPhone = outletsPhone;
    }

    public String getOutletsProvince() {
        return outletsProvince;
    }

    public void setOutletsProvince(String outletsProvince) {
        this.outletsProvince = outletsProvince;
    }

    public String getOutletsCity() {
        return outletsCity;
    }

    public void setOutletsCity(String outletsCity) {
        this.outletsCity = outletsCity;
    }

    public String getOutletsRegion() {
        return outletsRegion;
    }

    public void setOutletsRegion(String outletsRegion) {
        this.outletsRegion = outletsRegion;
    }

    public String getOutletsAddress() {
        return outletsAddress;
    }

    public void setOutletsAddress(String outletsAddress) {
        this.outletsAddress = outletsAddress;
    }

    public String getOutletsRemarks() {
        return outletsRemarks;
    }

    public void setOutletsRemarks(String outletsRemarks) {
        this.outletsRemarks = outletsRemarks;
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
