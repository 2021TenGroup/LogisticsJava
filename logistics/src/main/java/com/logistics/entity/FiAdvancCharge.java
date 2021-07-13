package com.logistics.entity;

import com.logistics.vo.OutletsVo;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 预付款表(FiAdvancCharge)实体类
 *
 * @author makejava
 * @since 2021-07-13 16:39:20
 */
@Data
@ToString
public class FiAdvancCharge implements Serializable {
    private static final long serialVersionUID = 799010079778892771L;
    /**
     * 预付款ID
     */
    private Integer acId;
    /**
     * 网点ID
     */
    private Integer outletsId;
    /**
     * 当前余额
     */
    private Double acBalance;
    /**
     * 警戒金额
     */
    private Double acAlertBalance;
    /**
     * 关闭金额
     */
    private Double acCloseBalance;
    /**
     * 是否启用
     */
    private Integer acState;
    /**
     * 增加人
     */
    private String addname;
    /**
     * 增加时间
     */
    private Date addtime;
    /**
     * 修改人
     */
    private String updatename;
    /**
     * 最后修改时间
     */
    private Date updatetime;
    /**
     * 删除人
     */
    private String deletename;
    /**
     * 删除时间
     */
    private Date deletetime;
    /**
     * 时效性
     */
    private Integer timeliness;

    /**
     * 网点维护类
     */
    private OutletsVo outletsVo;

}
