package com.logistics.service.impl;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.logistics.entity.FiAdvancCharge;
import com.logistics.dao.FiAdvancChargeDao;
import com.logistics.service.FiAdvancChargeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 预付款表(FiAdvancCharge)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 17:45:06
 */
@Transactional
@Service("fiAdvancChargeService")
@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
public class FiAdvancChargeServiceImpl implements FiAdvancChargeService {
    @Resource
    private FiAdvancChargeDao fiAdvancChargeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param acId 主键
     * @return 实例对象
     */
    @Override
    public FiAdvancCharge queryById(Integer acId) {
        return this.fiAdvancChargeDao.queryById(acId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FiAdvancCharge> queryAllByLimit(int offset, int limit) {
        return this.fiAdvancChargeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param fiAdvancCharge 实例对象
     * @return 实例对象
     */
    @Override
    public FiAdvancCharge insert(FiAdvancCharge fiAdvancCharge) {
        this.fiAdvancChargeDao.insert(fiAdvancCharge);
        return fiAdvancCharge;
    }

    /**
     * 修改数据
     *
     * @param fiAdvancCharge 实例对象
     * @return 实例对象
     */
    @Override
    public FiAdvancCharge update(FiAdvancCharge fiAdvancCharge) {
        this.fiAdvancChargeDao.update(fiAdvancCharge);
        return this.queryById(fiAdvancCharge.getAcId());
    }

    /**
     * 通过主键删除数据
     *
     * @param acId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer acId) {
        return this.fiAdvancChargeDao.deleteById(acId) > 0;
    }
}
