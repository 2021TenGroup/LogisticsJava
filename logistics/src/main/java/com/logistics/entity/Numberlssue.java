package com.logistics.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (Numberlssue)实体类
 *
 * @author makejava
 * @since 2021-07-11 19:35:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Numberlssue implements Serializable {
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
