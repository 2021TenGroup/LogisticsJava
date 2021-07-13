package com.logistics.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Commission)实体类
 *
 * @author makejava
 * @since 2021-07-13 11:15:19
 */
public class Commission implements Serializable {
    private static final long serialVersionUID = 174840568632311652L;

    private Integer comId;

    private Integer outletsId;

    private Integer cType;

    private Double commissionRatio;

    private String remarks;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;


    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Integer getOutletsId() {
        return outletsId;
    }

    public void setOutletsId(Integer outletsId) {
        this.outletsId = outletsId;
    }

    public Integer getCType() {
        return cType;
    }

    public void setCType(Integer cType) {
        this.cType = cType;
    }

    public Double getCommissionRatio() {
        return commissionRatio;
    }

    public void setCommissionRatio(Double commissionRatio) {
        this.commissionRatio = commissionRatio;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
