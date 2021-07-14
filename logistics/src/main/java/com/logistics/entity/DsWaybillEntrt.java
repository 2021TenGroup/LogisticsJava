package com.logistics.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * (DsWaybillEntrt)实体类
 *
 * @author makejava
 * @since 2021-07-13 05:31:30
 */
@Data
@ToString
public class DsWaybillEntrt implements Serializable {
    private static final long serialVersionUID = -80895337692864668L;

    private Integer waybillId;

    private Integer oId;

    private Integer empId;

    private String waybillNumber;


    public Integer getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Integer waybillId) {
        this.waybillId = waybillId;
    }

    public Integer getOId() {
        return oId;
    }

    public void setOId(Integer oId) {
        this.oId = oId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillNumber(String waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

}
