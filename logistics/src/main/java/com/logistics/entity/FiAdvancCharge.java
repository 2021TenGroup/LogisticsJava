package com.logistics.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (FiAdvancCharge)实体类
 *
 * @author makejava
 * @since 2021-07-11 16:42:54
 */
public class FiAdvancCharge implements Serializable {
    private static final long serialVersionUID = -66903867906870691L;

    private Integer acId;

    private Integer outletsId;

    private Double acBalance;

    private Double acAlertBalance;

    private Double acCloseBalance;

    private Integer acState;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;


    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public Integer getOutletsId() {
        return outletsId;
    }

    public void setOutletsId(Integer outletsId) {
        this.outletsId = outletsId;
    }

    public Double getAcBalance() {
        return acBalance;
    }

    public void setAcBalance(Double acBalance) {
        this.acBalance = acBalance;
    }

    public Double getAcAlertBalance() {
        return acAlertBalance;
    }

    public void setAcAlertBalance(Double acAlertBalance) {
        this.acAlertBalance = acAlertBalance;
    }

    public Double getAcCloseBalance() {
        return acCloseBalance;
    }

    public void setAcCloseBalance(Double acCloseBalance) {
        this.acCloseBalance = acCloseBalance;
    }

    public Integer getAcState() {
        return acState;
    }

    public void setAcState(Integer acState) {
        this.acState = acState;
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
