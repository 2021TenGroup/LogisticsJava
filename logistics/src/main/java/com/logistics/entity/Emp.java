package com.logistics.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (Emp)实体类
 *
 * @author makejava
 * @since 2021-07-11 16:35:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "outlets")
public class Emp implements Serializable {
    private Integer empId;

    private Integer positionId;

    private Integer outletsId;

    private String empNumber;

    private String userName;

    private String passWord;

    private Integer phone;

    private String identityCards;

    private String address;

    private String zPhotographs;

    private String fPhotographs;

    private String empName;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private Outlets outlets;
    private static final long serialVersionUID = 1L;
}
