package com.logistics.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * 运费账单表(FiCashBill)实体类
 *
 * @author makejava
 * @since 2021-07-12 15:34:15
 */
public class FiCashBill implements Serializable {
    private static final long serialVersionUID = -96828468488408714L;
    /**
     * 现金账单ID
     */
    private Integer cbId;
    /**
     * 运单编号
     */
    private String waybillNumber;
    /**
     * 金额
     */
    private Double cbMoney;
    /**
     * 收取状态
     */
    private Integer cbState;
    /**
     * 运费类型
     */
    private Integer cb_FreightType;
    /**
     * 交付类型
     */
    private Integer cbDeliverType;
    /**
     * 增加人
     */
    private String addname;
    /**
     * 增加时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date addtime;
    /**
     * 修改人
     */
    private String updatename;
    /**
     * 最后修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updatetime;
    /**
     * 删除人
     */
    private String deletename;
    /**
     * 删除时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date deletetime;
    /**
     * 时效性
     */
    private Integer timeliness;


    public Integer getCbId() {
        return cbId;
    }

    public void setCbId(Integer cbId) {
        this.cbId = cbId;
    }

    public String getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillNumber(String waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public Double getCbMoney() {
        return cbMoney;
    }

    public void setCbMoney(Double cbMoney) {
        this.cbMoney = cbMoney;
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

}
