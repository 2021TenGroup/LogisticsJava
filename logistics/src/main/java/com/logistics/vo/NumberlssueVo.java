package com.logistics.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@ClassMeta(className = "单号发放表")
public class NumberlssueVo {
    private Integer numberlssueId;

    private Integer outletsId;

    private String numberlssueOrder;

    private Integer numberlssueNumber;

    private String numberlssueEnd;

    private Integer numberlssueUp;

    private String numberlssueRemarks;

    private String addname;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private OutletsVo outletsVo;
    private static final long serialVersionUID = 1L;
}
