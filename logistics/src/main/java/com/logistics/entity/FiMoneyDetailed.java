package com.logistics.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 财务明细表(FiMoneyDetailed)实体类
 *
 * @author makejava
 * @since 2021-07-12 15:34:15
 */
public class FiMoneyDetailed implements Serializable {
    private static final long serialVersionUID = -26858458022500803L;
    /**
     * 财务明细ID
     */
    private Integer mdId;
    /**
     * 运单编号
     */
    private String waybillNumber;
    /**
     * 网点名称
     */
    private String outletsName;
    /**
     * 操作人名称
     */
    private String userName;
    /**
     * 收取金额
     */
    private Double mdCollectMoney;
    /**
     * 类型
     */
    private Integer mdType;
    /**
     * 网点余额
     */
    private Double mdBalance;
    /**
     * 金额详情
     */
    private Double mdDetails;
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


    public Integer getMdId() {
        return mdId;
    }

    public void setMdId(Integer mdId) {
        this.mdId = mdId;
    }

    public String getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillNumber(String waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public String getOutletsName() {
        return outletsName;
    }

    public void setOutletsName(String outletsName) {
        this.outletsName = outletsName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getMdCollectMoney() {
        return mdCollectMoney;
    }

    public void setMdCollectMoney(Double mdCollectMoney) {
        this.mdCollectMoney = mdCollectMoney;
    }

    public Integer getMdType() {
        return mdType;
    }

    public void setMdType(Integer mdType) {
        this.mdType = mdType;
    }

    public Double getMdBalance() {
        return mdBalance;
    }

    public void setMdBalance(Double mdBalance) {
        this.mdBalance = mdBalance;
    }

    public Double getMdDetails() {
        return mdDetails;
    }

    public void setMdDetails(Double mdDetails) {
        this.mdDetails = mdDetails;
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
