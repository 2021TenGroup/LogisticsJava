package com.logistics.entity;

import java.io.Serializable;

/**
 * 签收录入表(DsSign)实体类
 *
 * @author makejava
 * @since 2021-07-11 19:37:23
 */
public class DsSign implements Serializable {
    private static final long serialVersionUID = 845731164438147541L;
    /**
    * 牵手录入ID
    */
    private Integer signId;
    /**
    * 运单ID
    */
    private Integer waybillId;
    /**
    * 员工ID
    */
    private Integer empId;
    /**
    * 签收状态 0：未签收 1：已签收
    */
    private Integer signState;


    public Integer getSignId() {
        return signId;
    }

    public void setSignId(Integer signId) {
        this.signId = signId;
    }

    public Integer getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Integer waybillId) {
        this.waybillId = waybillId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getSignState() {
        return signState;
    }

    public void setSignState(Integer signState) {
        this.signState = signState;
    }

}