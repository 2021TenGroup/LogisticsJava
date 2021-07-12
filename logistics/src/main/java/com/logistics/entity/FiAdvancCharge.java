package com.logistics.entity;

import java.io.Serializable;
import java.util.Date;

import com.logistics.vo.OutletsVo;
import lombok.Data;

/**
 * fi_advanc_charge
 * @author 
 */
@Data
public class FiAdvancCharge implements Serializable {
    private Integer acId;

    private Integer outletsId;

    private Long acBalance;

    private Long acAlertBalance;

    private Long acCloseBalance;

    private Integer acState;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    /**
     * 网点维护类
     */
    private OutletsVo outletsVo;

    private static final long serialVersionUID = 1L;
}
