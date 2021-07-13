package com.logistics.vo;

import com.logistics.ann.ClassMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Wangz
 * @Date: 2021/07/12/14:51
 * @Description:
 */
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
@ClassMeta(className = "运单录入表")
public class DsWaybillEntrtVo {
    private Integer waybillId;

    private Integer oId;

    private Integer empId;

    private Integer waybillNumber;
}
