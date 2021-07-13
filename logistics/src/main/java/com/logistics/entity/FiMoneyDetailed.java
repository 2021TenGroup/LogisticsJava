package com.logistics.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 财务明细表(FiMoneyDetailed)实体类
 *
 * @author makejava
 * @since 2021-07-12 15:34:15
 */
@Data
@ToString
public class FiMoneyDetailed implements Serializable {
    private static final long serialVersionUID = -26858458022500803L;
    /**
     * 财务明细ID
     */
    private Integer mdId;
    /**
     * 运单编号
     */
    private String waybillNumber;
    /**
     * 网点名称
     */
    private String outletsName;
    /**
     * 操作人名称
     */
    private String userName;
    /**
     * 收取金额
     */
    private Double mdCollectMoney;
    /**
     * 类型
     */
    private Integer mdType;
    /**
     * 网点余额
     */
    private Double mdBalance;
    /**
     * 金额详情
     */
    private String mdDetails;
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
