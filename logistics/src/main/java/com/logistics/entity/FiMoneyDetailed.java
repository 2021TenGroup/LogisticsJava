package com.logistics.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (FiMoneyDetailed)实体类
 *
 * @author makejava
 * @since 2021-07-11 16:42:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FiMoneyDetailed implements Serializable {
    private static final long serialVersionUID = -10419793735731697L;

    private Integer empId;

    private Integer waybillId;

    private Integer mdId;

    private Double mdCollectMoney;

    private Integer mdType;

    private Double mdBalance;

    private Double mdDetails;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private Integer outletsId;

    private Integer pgId;
}
