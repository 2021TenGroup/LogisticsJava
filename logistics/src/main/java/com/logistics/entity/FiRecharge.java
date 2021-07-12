package com.logistics.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * fi_recharge
 * @author 
 */
@Data
public class FiRecharge implements Serializable {
    private Integer reId;

    private Integer outletsId;

    private Integer reNetwork;

    private Integer reType;

    private BigDecimal reMoney;

    private String reRemarks;

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