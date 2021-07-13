package com.logistics.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 运费账单表(FiCashBill)实体类
 *
 * @author makejava
 * @since 2021-07-12 15:34:15
 */
@Data
@ToString
public class FiCashBill implements Serializable {
    private static final long serialVersionUID = -96828468488408714L;
    /**
     * 现金账单ID
     */
    private Integer cbId;
    /**
     * 运单编号
     */
    private String waybillNumber;
    /**
     * 金额
     */
    private Double cbMoney;
    /**
     * 收取状态
     */
    private Integer cbState;
    /**
     * 运费类型
     */
    private Integer cbFreightType;
    /**
     * 交付类型
     */
    private Integer cbDeliverType;
    /**
     * 增加人
     */
    private String addname;
    /**
     * 增加时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date addtime;
    /**
     * 修改人
     */
    private String updatename;
    /**
     * 最后修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updatetime;
    /**
     * 删除人
     */
    private String deletename;
    /**
     * 删除时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date deletetime;
    /**
     * 时效性
     */
    private Integer timeliness;

}
