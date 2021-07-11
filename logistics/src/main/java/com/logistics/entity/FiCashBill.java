package com.logistics.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (FiCashBill)实体类
 *
 * @author makejava
 * @since 2021-07-11 16:42:57
 */
public class FiCashBill implements Serializable {
    private static final long serialVersionUID = -20778416296763768L;

    private Integer cbId;

    private Integer waybillId;

    private Integer cbState;

    private Integer cb_FreightType;

    private Integer cbDeliverType;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private Integer empId;


    public Integer getCbId() {
        return cbId;
    }

    public void setCbId(Integer cbId) {
        this.cbId = cbId;
    }

    public Integer getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Integer waybillId) {
        this.waybillId = waybillId;
    }

    public Integer getCbState() {
        return cbState;
    }

    public void setCbState(Integer cbState) {
        this.cbState = cbState;
    }

    public Integer getCb_FreightType() {
        return cb_FreightType;
    }

    public void setCb_FreightType(Integer cb_FreightType) {
        this.cb_FreightType = cb_FreightType;
    }

    public Integer getCbDeliverType() {
        return cbDeliverType;
    }

    public void setCbDeliverType(Integer cbDeliverType) {
        this.cbDeliverType = cbDeliverType;
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

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

}
