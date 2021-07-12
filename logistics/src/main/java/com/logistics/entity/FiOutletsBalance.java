package com.logistics.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 网点余额表(FiOutletsBalance)实体类
 *
 * @author makejava
 * @since 2021-07-12 15:34:15
 */
public class FiOutletsBalance implements Serializable {
    private static final long serialVersionUID = -73371787781162245L;
    /**
     * 网点余额ID
     */
    private Integer obId;
    /**
     * 网点名称
     */
    private String outletsName;
    /**
     * 余额
     */
    private String obBalance;
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


    public Integer getObId() {
        return obId;
    }

    public void setObId(Integer obId) {
        this.obId = obId;
    }

    public String getOutletsName() {
        return outletsName;
    }

    public void setOutletsName(String outletsName) {
        this.outletsName = outletsName;
    }

    public String getObBalance() {
        return obBalance;
    }

    public void setObBalance(String obBalance) {
        this.obBalance = obBalance;
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
