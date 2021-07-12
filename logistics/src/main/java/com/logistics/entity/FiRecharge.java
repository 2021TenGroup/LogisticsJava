package com.logistics.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 预付款充值表(FiRecharge)实体类
 *
 * @author makejava
 * @since 2021-07-12 15:34:16
 */
public class FiRecharge implements Serializable {
    private static final long serialVersionUID = -26487537298487780L;
    /**
     * 预付款充值ID
     */
    private Integer reId;
    /**
     * 操作网点
     */
    private String outletsNameOper;
    /**
     * 充值网点
     */
    private String outletsName;
    /**
     * 付款类型
     */
    private Integer reType;
    /**
     * 金额
     */
    private Double reMoney;
    /**
     * 备注
     */
    private String reRemarks;
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


    public Integer getReId() {
        return reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    public String getOutletsNameOper() {
        return outletsNameOper;
    }

    public void setOutletsNameOper(String outletsNameOper) {
        this.outletsNameOper = outletsNameOper;
    }

    public String getOutletsName() {
        return outletsName;
    }

    public void setOutletsName(String outletsName) {
        this.outletsName = outletsName;
    }

    public Integer getReType() {
        return reType;
    }

    public void setReType(Integer reType) {
        this.reType = reType;
    }

    public Double getReMoney() {
        return reMoney;
    }

    public void setReMoney(Double reMoney) {
        this.reMoney = reMoney;
    }

    public String getReRemarks() {
        return reRemarks;
    }

    public void setReRemarks(String reRemarks) {
        this.reRemarks = reRemarks;
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
