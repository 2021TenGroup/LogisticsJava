package com.logistics.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
 * (Outlets)实体类
 *
 * @author makejava
 * @since 2021-07-11 14:38:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Outlets implements Serializable {

    private Integer outletsId;

    private String outletsNumber;

    private String outletsName;

    private Integer outletsBelonging;

    private String outletsPerson;

    private Integer outletsPhone;

    private String outletsProvince;

    private String outletsCity;

    private String outletsRegion;

    private String outletsAddress;

    private String outletsRemarks;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private static final long serialVersionUID = 1L;

}
