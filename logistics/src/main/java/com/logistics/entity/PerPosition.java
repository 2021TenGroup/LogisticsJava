package com.logistics.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (PerPosition)实体类
 *
 * @author makejava
 * @since 2021-07-11 16:59:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PerPosition implements Serializable {
    private Integer positionId;

    private String positionName;

    private Integer outletsId;

    private Date addtime;

    private String updatename;

    private Date updatetime;

    private String deletename;

    private Date deletetime;

    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}
