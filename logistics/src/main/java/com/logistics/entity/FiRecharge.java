package com.logistics.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (FiRecharge)实体类
 *
 * @author makejava
 * @since 2021-07-11 16:42:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FiRecharge implements Serializable {
    private static final long serialVersionUID = 225721965220296589L;

    private Integer reId;

    private Integer outletsId;

    private Integer reNetwork;

    private Integer reType;

    private Double reMoney;

    private String reRemarks;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private Integer empId;

}
