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
@ClassMeta(className = "客户维护表")
@ToString(exclude = "outletsVo")
public class CustomerVo {
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

    private OutletsVo outletsVo;
    private static final long serialVersionUID = 1L;
}
