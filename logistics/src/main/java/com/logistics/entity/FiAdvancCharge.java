package com.logistics.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 预付款表(FiAdvancCharge)实体类
 *
 * @author makejava
 * @since 2021-07-12 15:34:14
 */
public class FiAdvancCharge implements Serializable {
    private static final long serialVersionUID = -20992184431539366L;
    /**
     * 预付款ID
     */
    private Integer acId;
    /**
     * 网点名称
     */
    private String outletsName;
    /**
     * 当前余额
     */
    private Double acBalance;
    /**
     * 警戒金额
     */
    private Double acAlertBalance;
    /**
     * 关闭金额
     */
    private Double acCloseBalance;
    /**
     * 是否启用
     */
    private Integer acState;
    /**
     * 增加人
     */
    private String addname;
    /**
     * 增加时间
     */
    private Date addtime;
    /**
     * 修改人
     */
    private String updatename;
    /**
     * 最后修改时间
     */
    private Date updatetime;
    /**
     * 删除人
     */
    private String deletename;
    /**
     * 删除时间
     */
    private Date deletetime;
    /**
     * 时效性
     */
    private Integer timeliness;


    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public String getOutletsName() {
        return outletsName;
    }

    public void setOutletsName(String outletsName) {
        this.outletsName = outletsName;
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
