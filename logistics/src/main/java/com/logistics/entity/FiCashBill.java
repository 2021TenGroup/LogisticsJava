package com.logistics.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * fi_cash_bill
 * @author 
 */
@Data
public class FiCashBill implements Serializable {
    private Integer cbId;

    private Integer waybillId;

    private Integer cbState;

    private Integer cbFreightType;

    private Integer cbDeliverType;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private Integer empId;

    private static final long serialVersionUID = 1L;
}