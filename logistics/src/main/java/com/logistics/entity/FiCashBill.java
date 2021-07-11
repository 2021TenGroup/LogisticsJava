package com.logistics.entity;

import ch.qos.logback.core.joran.spi.NoAutoStart;
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
 * @since 2021-07-12 02:51:53
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FiCashBill implements Serializable {
    private static final long serialVersionUID = 999866462883196861L;

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
