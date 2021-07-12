package com.logistics.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * fi_money_detailed
 * @author 
 */
@Data
public class FiMoneyDetailed implements Serializable {
    private Integer mdId;

    private Integer empId;

    private Integer waybillId;

    private BigDecimal mdCollectMoney;

    private Integer mdType;

    private BigDecimal mdBalance;

    private BigDecimal mdDetails;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private Integer outletsId;

    private Integer pgId;

    private static final long serialVersionUID = 1L;
}