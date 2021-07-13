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
@ClassMeta(className = "单号规则表")
public class NumberRuleVo {
    private Integer ruleId;

    private String ruleName;

    private String ruleStart;

    private String ruleEnd;

    private Integer ruleLenght;

    private String ruleMax;

    private String ruleRemarks;

    private Integer ruleType;

    private Integer ruleUsage;

    private String addname;

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}
