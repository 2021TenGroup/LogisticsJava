package com.logistics.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (NumberRule)实体类
 *
 * @author makejava
 * @since 2021-07-11 19:20:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NumberRule implements Serializable {
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
