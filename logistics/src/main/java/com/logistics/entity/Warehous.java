package com.logistics.entity;

import com.logistics.vo.DsWaybillEntrtVo;
import com.logistics.vo.OutletsVo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Warehous)实体类
 *
 * @author makejava
 * @since 2021-07-11 17:11:13
 */
public class Warehous implements Serializable {
    private static final long serialVersionUID = 607270531962910577L;

    private Integer warehousId;

    private Integer outletsId;

    private Integer waybillId;

    private String enterCode;

    private Date enterTime;

    private String enterPeople;

    private Integer upOutletsId;

    private String outCode;

    private Date outTime;

    private String outPeople;

    private Integer downOutletsId;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private OutletsVo outletsVo;

    private DsWaybillEntrtVo dsWaybillEntrtvo;


    public Integer getWarehousId() {
        return warehousId;
    }

    public void setWarehousId(Integer warehousId) {
        this.warehousId = warehousId;
    }

    public Integer getOutletsId() {
        return outletsId;
    }

    public void setOutletsId(Integer outletsId) {
        this.outletsId = outletsId;
    }

    public Integer getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Integer waybillId) {
        this.waybillId = waybillId;
    }

    public String getEnterCode() {
        return enterCode;
    }

    public void setEnterCode(String enterCode) {
        this.enterCode = enterCode;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }

    public String getEnterPeople() {
        return enterPeople;
    }

    public void setEnterPeople(String enterPeople) {
        this.enterPeople = enterPeople;
    }

    public Integer getUpOutletsId() {
        return upOutletsId;
    }

    public void setUpOutletsId(Integer upOutletsId) {
        this.upOutletsId = upOutletsId;
    }

    public String getOutCode() {
        return outCode;
    }

    public void setOutCode(String outCode) {
        this.outCode = outCode;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public String getOutPeople() {
        return outPeople;
    }

    public void setOutPeople(String outPeople) {
        this.outPeople = outPeople;
    }

    public Integer getDownOutletsId() {
        return downOutletsId;
    }

    public void setDownOutletsId(Integer downOutletsId) {
        this.downOutletsId = downOutletsId;
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
