package com.logistics.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (FiCashBill)实体类
 *
 * @author makejava
 * @since 2021-07-11 16:42:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FiCashBill implements Serializable {
    private static final long serialVersionUID = -20778416296763768L;

    private Integer cbId;

    private Integer waybillId;

    private Integer cbState;

    private Integer cb_FreightType;

    private Integer cbDeliverType;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private Integer empId;

}
