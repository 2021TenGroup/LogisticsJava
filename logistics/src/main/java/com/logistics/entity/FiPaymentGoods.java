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
 * @since 2021-07-12 02:32:09
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FiPaymentGoods implements Serializable {
    private static final long serialVersionUID = -31338187782071863L;

    private Integer pgId;

    private Integer waybillId;

    private Double pgPayment;

    private Double pgServiceMoney;

    private Double pgActualMoney;

    private Integer outletsId1;

    private Integer empId;

    private Integer outletsId2;

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
