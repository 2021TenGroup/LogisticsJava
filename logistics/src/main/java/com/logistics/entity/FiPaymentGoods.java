package com.logistics.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (FiPaymentGoods)实体类
 *
 * @author makejava
 * @since 2021-07-11 16:42:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FiPaymentGoods implements Serializable {
    private static final long serialVersionUID = -98430115607432827L;

    private Integer pgId;

    private String waybillId;

    private Double pgPayment;

    private Double pgServiceMoney;

    private Double pgActualMoney;

    private Double outletsId1;

    private Double empId;

    private Double outletsId2;

    private String sender;

    private String senderPhone;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

}
