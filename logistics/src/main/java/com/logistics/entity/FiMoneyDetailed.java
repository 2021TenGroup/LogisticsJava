package com.logistics.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (FiMoneyDetailed)实体类
 *
 * @author makejava
 * @since 2021-07-12 11:46:56
 */
public class FiMoneyDetailed implements Serializable {
    private static final long serialVersionUID = -39694027452475496L;

    private Integer empId;

    private Integer waybillId;

    private Integer mdId;

    private Double mdCollectMoney;

    private Integer mdType;

    private Double mdBalance;

    private Double mdDetails;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private Integer outletsId;

    private Integer pgId;


    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Integer waybillId) {
        this.waybillId = waybillId;
    }

    public Integer getMdId() {
        return mdId;
    }

    public void setMdId(Integer mdId) {
        this.mdId = mdId;
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

    public Integer getOutletsId() {
        return outletsId;
    }

    public void setOutletsId(Integer outletsId) {
        this.outletsId = outletsId;
    }

    public Integer getPgId() {
        return pgId;
    }

    public void setPgId(Integer pgId) {
        this.pgId = pgId;
    }

}
