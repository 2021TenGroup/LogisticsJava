package com.logistics.vo;

import com.logistics.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;
import java.util.Date;

@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
@ClassMeta(className = "网点维护表")
public class OutletsVo {
    private Integer outletsId;

    private String outletsNumber;

    private String outletsName;

    private Integer outletsBelonging;

    private String outletsPerson;

    private Integer outletsPhone;

    private String outletsProvince;

    private String outletsCity;

    private String outletsRegion;

    private String outletsAddress;

    private String outletsRemarks;

    public String addname;

    private Date addtime;

    public String updatename;

    private Date updatetime;

    public String deletename;

    private Date deletetime;

    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}
