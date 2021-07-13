package com.logistics.service.impl;

import com.logistics.dao.FiAdvancChargeDao;
import com.logistics.dao.FiRechargeDao;
import com.logistics.entity.FiAdvancCharge;
import com.logistics.entity.FiRecharge;
import com.logistics.service.FiAdvancChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 预付款表(FiAdvancCharge)表服务实现类
 *
 * @author makejava
 * @since 2021-07-13 16:39:20
 */
@Service("fiAdvancChargeService")
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

    //邓联文 根据网点ID查询预付款信息
    @Override
    public FiAdvancCharge queryByOutletsId(Integer outletsId){
        return fiAdvancChargeDao.queryByOutletsId(outletsId);
    }

}
