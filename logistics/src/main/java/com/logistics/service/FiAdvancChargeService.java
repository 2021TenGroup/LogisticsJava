package com.logistics.service;

import com.logistics.entity.FiAdvancCharge;
import com.logistics.entity.FiRecharge;

import java.util.List;

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

    /**
     * 插入一条预收款记录
     */
    void insertSelective(FiAdvancCharge fiAdvancCharge);
}
