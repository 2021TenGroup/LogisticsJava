package com.logistics.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 签收录入表(DsSign)实体类
 *
 * @author makejava
 * @since 2021-07-11 19:37:23
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DsSign implements Serializable {
    private static final long serialVersionUID = 845731164438147541L;
    /**
    * 签收录入ID
    */
    private Integer signId;
    /**
    * 运单ID
    */
    private Integer waybillId;
    /**
    * 员工ID
    */
    private Integer empId;
    /**
    * 签收状态 0：未签收 1：已签收
    */
    private Integer signState;


}