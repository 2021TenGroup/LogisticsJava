package com.logistics.service.impl;

import com.logistics.entity.FiPaymentGoods;
import com.logistics.dao.FiPaymentGoodsDao;
import com.logistics.service.FiPaymentGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FiPaymentGoods)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 01:21:44
 */
@Service("fiPaymentGoodsService")
public class FiPaymentGoodsServiceImpl implements FiPaymentGoodsService {
    @Resource
    private FiPaymentGoodsDao fiPaymentGoodsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pgId 主键
     * @return 实例对象
     */
    @Override
    public FiPaymentGoods queryById(Integer pgId) {
        return this.fiPaymentGoodsDao.queryById(pgId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FiPaymentGoods> queryAllByLimit(int offset, int limit) {
        return this.fiPaymentGoodsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param fiPaymentGoods 实例对象
     * @return 实例对象
     */
    @Override
    public FiPaymentGoods insert(FiPaymentGoods fiPaymentGoods) {
        this.fiPaymentGoodsDao.insert(fiPaymentGoods);
        return fiPaymentGoods;
    }

    /**
     * 修改数据
     *
     * @param fiPaymentGoods 实例对象
     * @return 实例对象
     */
    @Override
    public FiPaymentGoods update(FiPaymentGoods fiPaymentGoods) {
        this.fiPaymentGoodsDao.update(fiPaymentGoods);
        return this.queryById(fiPaymentGoods.getPgId());
    }

    /**
     * 通过主键删除数据
     *
     * @param pgId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pgId) {
        return this.fiPaymentGoodsDao.deleteById(pgId) > 0;
    }
}
