package com.logistics.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * 代收货款表(FiPaymentGoods)实体类
 *
 * @author makejava
 * @since 2021-07-13 04:58:49
 */
public class FiPaymentGoods implements Serializable {
    private static final long serialVersionUID = -48370970185985367L;
    /**
     * 代收货款ID
     */
    private Integer pgId;
    /**
     * 运单编号
     */
    private String waybillNumber;
    /**
     * 代收金额
     */
    private Double pgPayment;
    /**
     * 服务费
     */
    private Double pgServiceMoney;
    /**
     * 实发金额
     */
    private Double pgActualMoney;
    /**
     * 首网点
     */
    private String outletsId1;
    /**
     * 签收员工
     */
    private String userName;
    /**
     * 末网点
     */
    private String outletsId2;
    /**
     * 发放状态
     */
    private Integer pgState;
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
    /**
     * 客户姓名
     */
    private String pgSender;
    /**
     * 客户手机号
     */
    private String pgSenderPhone;


    public Integer getPgId() {
        return pgId;
    }

    public void setPgId(Integer pgId) {
        this.pgId = pgId;
    }

    public String getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillNumber(String waybillNumber) {
        this.waybillNumber = waybillNumber;
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

    public String getOutletsId1() {
        return outletsId1;
    }

    public void setOutletsId1(String outletsId1) {
        this.outletsId1 = outletsId1;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOutletsId2() {
        return outletsId2;
    }

    public void setOutletsId2(String outletsId2) {
        this.outletsId2 = outletsId2;
    }

    public Integer getPgState() {
        return pgState;
    }

    public void setPgState(Integer pgState) {
        this.pgState = pgState;
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

    public String getPgSender() {
        return pgSender;
    }

    public void setPgSender(String pgSender) {
        this.pgSender = pgSender;
    }

    public String getPgSenderPhone() {
        return pgSenderPhone;
    }

    public void setPgSenderPhone(String pgSenderPhone) {
        this.pgSenderPhone = pgSenderPhone;
    }

}
