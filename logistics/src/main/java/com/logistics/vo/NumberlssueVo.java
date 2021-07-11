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
@ClassMeta(className = "单号发放表")
public class NumberlssueVo {
    private Integer numberlssueId;

    private Integer outletsId;

    private Integer numberlssueOrder;

    private Integer numberlssueNumber;

    private String numberlssueEnd;

    private Integer numberlssueUp;

    private String numberlssueRemarks;

    private String addname;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}
