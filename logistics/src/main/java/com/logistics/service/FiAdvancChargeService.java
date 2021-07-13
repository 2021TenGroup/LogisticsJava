package com.logistics.service;

import com.logistics.entity.FiAdvancCharge;
import com.logistics.entity.FiRecharge;

import java.util.List;

/**
 * 预付款表(FiAdvancCharge)表服务接口
 *
 * @author makejava
 * @since 2021-07-13 16:39:20
 */
public interface FiAdvancChargeService {

    /**
     * 查询所有预付款
     */
    List<FiAdvancCharge> findAllAdvance();

    /**
     * 开账
     */
    int updateAdvance(FiAdvancCharge fiAdvancCharge);

    /**
     * 充值
     */
    void addAdvance(FiRecharge fiRecharge);

    /**
     * 充值记录
     */
    List<FiRecharge> findAllRecharge();

    //邓联文 根据网点ID查询预付款信息
    FiAdvancCharge queryByOutletsId(Integer outletsId);

}
