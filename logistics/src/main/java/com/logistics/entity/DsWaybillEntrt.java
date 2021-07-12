package com.logistics.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (DsWaybillEntrt)实体类
 *
 * @author makejava
 * @since 2021-07-12 14:08:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DsWaybillEntrt implements Serializable {
    private static final long serialVersionUID = -96005375128650652L;
    
    private Integer waybillId;
    
    private Integer oId;
    
    private Integer empId;

    private Orders orders;


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

}