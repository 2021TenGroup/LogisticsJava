package com.logistics.vo;

import com.logistics.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
@ClassMeta(className = "用户表")
@ToString(exclude = "outletsVo,perPositionVo")
public class EmpVo {
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

    private OutletsVo outletsVo;
    private PerPositionVo perPositionVo;
    private static final long serialVersionUID = 1L;
}
