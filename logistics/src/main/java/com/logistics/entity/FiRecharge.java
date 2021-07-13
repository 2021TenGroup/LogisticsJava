package com.logistics.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.logistics.vo.OutletsVo;
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

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private Integer empId;

    /**
     * 网点维护类
     */
    private OutletsVo outletsVo;

    private static final long serialVersionUID = 1L;
}
