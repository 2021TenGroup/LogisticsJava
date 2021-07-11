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
@ClassMeta(className = "职位表")
public class PerPositionVo {
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
