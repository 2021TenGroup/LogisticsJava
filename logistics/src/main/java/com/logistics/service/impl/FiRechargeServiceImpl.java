package com.logistics.service.impl;

import com.logistics.entity.FiRecharge;
import com.logistics.dao.FiRechargeDao;
import com.logistics.service.FiRechargeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FiRecharge)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 16:43:00
 */
@Service("fiRechargeService")
public class FiRechargeServiceImpl implements FiRechargeService {
    @Resource
    private FiRechargeDao fiRechargeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param reId 主键
     * @return 实例对象
     */
    @Override
    public FiRecharge queryById(Integer reId) {
        return this.fiRechargeDao.queryById(reId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FiRecharge> queryAllByLimit(int offset, int limit) {
        return this.fiRechargeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param fiRecharge 实例对象
     * @return 实例对象
     */
    @Override
    public FiRecharge insert(FiRecharge fiRecharge) {
        this.fiRechargeDao.insert(fiRecharge);
        return fiRecharge;
    }

    /**
     * 修改数据
     *
     * @param fiRecharge 实例对象
     * @return 实例对象
     */
    @Override
    public FiRecharge update(FiRecharge fiRecharge) {
        this.fiRechargeDao.update(fiRecharge);
        return this.queryById(fiRecharge.getReId());
    }

    /**
     * 通过主键删除数据
     *
     * @param reId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer reId) {
        return this.fiRechargeDao.deleteById(reId) > 0;
    }
}
