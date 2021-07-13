package com.logistics.service.impl;

import com.logistics.dao.FiAdvancChargeDao;
import com.logistics.dao.FiRechargeDao;
import com.logistics.entity.FiAdvancCharge;
import com.logistics.entity.FiRecharge;
import com.logistics.service.FiAdvancChargeService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j
@Service
public class FiAdvancChargeServiceImpl implements FiAdvancChargeService {
    @Autowired
    FiAdvancChargeDao fiAdvancChargeDao;

    @Autowired
    FiRechargeDao fiRechargeDao;

    /**
     * 查询所有预付款
     */
    @Override
    public List<FiAdvancCharge> findAllAdvance() {
        List<FiAdvancCharge> list = fiAdvancChargeDao.findAllAdvance();
        return list;
    }

    /**
     * 开账
     */
    @Override
    @Transactional
    public int updateAdvance(FiAdvancCharge fiAdvancCharge) {
        return fiAdvancChargeDao.updateAdvance(fiAdvancCharge);
    }

    /**
     * 充值
     */
    @Override
    @Transactional
    public void addAdvance(FiRecharge fiRecharge) {
        fiRecharge.setTimeliness(0);
        fiRechargeDao.addAdvance(fiRecharge);
        System.out.println(fiRecharge.getOutletsId()+"666666666666");
        System.out.println(fiRecharge.getReMoney()+"999999999999");
        fiAdvancChargeDao.updateReMoney(fiRecharge.getReNetwork(),fiRecharge.getReMoney());
    }

    /**
     * 充值记录
     */
    @Override
    public List<FiRecharge> findAllRecharge() {
        List<FiRecharge> list = fiRechargeDao.findAllRecharge();
        return list;
    }
}
