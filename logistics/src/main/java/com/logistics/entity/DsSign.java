package com.logistics.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (DsSign)实体类
 *
 * @author makejava
 * @since 2021-07-12 14:02:50
 */
public class DsSign implements Serializable {
    private static final long serialVersionUID = 605181922543069624L;
    
    private Integer signId;
    
    private Integer waybillId;
    
    private Integer empId;
    
    private Integer signStatus;
    
    private Date operationTime;


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

    public Integer getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(Integer signStatus) {
        this.signStatus = signStatus;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

}