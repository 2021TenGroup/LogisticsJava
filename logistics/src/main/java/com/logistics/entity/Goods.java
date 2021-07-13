package com.logistics.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 物品
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods implements Serializable {
    private Integer goodId;

    private String goodName;

    private Integer goodNumber;

    private BigDecimal weight;

    private BigDecimal volume;

    private BigDecimal longS;

    private BigDecimal wide;

    private BigDecimal high;

    private String remarks;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}