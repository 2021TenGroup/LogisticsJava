package com.logistics.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (FiAdvancCharge)实体类
 *
 * @author makejava
 * @since 2021-07-11 16:42:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FiAdvancCharge implements Serializable {
    private static final long serialVersionUID = -66903867906870691L;

    private Integer acId;

    private Integer outletsId;

    private Double acBalance;

    private Double acAlertBalance;

    private Double acCloseBalance;

    private Integer acState;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

}
