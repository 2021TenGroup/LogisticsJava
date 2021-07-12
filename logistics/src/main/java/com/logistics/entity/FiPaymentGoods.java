package com.logistics.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * fi_payment_goods
 * @author 
 */
@Data
public class FiPaymentGoods implements Serializable {
    private Integer pgId;

    private Integer waybillId;

    private BigDecimal pgPayment;

    private BigDecimal pgServiceMoney;

    private BigDecimal pgActualMoney;

    private BigDecimal outletsId1;

    private BigDecimal empId;

    private BigDecimal outletsId2;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}