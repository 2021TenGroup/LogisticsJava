package com.logistics.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (Customer)实体类
 *
 * @author makejava
 * @since 2021-07-11 15:28:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "outlets")
public class Customer implements Serializable {
    private Integer customerId;

    private Integer outletsId;

    private String customerNumber;

    private String customerName;

    private Integer customerSettlement;

    private String customerUser;

    private String customerPhone;

    private String customerProvince;

    private String customerCity;

    private String customerRegion;

    private String customerAddress;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private Outlets outlets;
    private static final long serialVersionUID = 1L;
}
