package com.logistics.service;

import com.logistics.entity.FiPaymentGoods;

import java.util.List;

/**
 * (FiPaymentGoods)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 01:21:44
 */
public interface FiPaymentGoodsService {

    /**
     * 通过ID查询单条数据
     *
     * @param pgId 主键
     * @return 实例对象
     */
    FiPaymentGoods queryById(Integer pgId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FiPaymentGoods> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param fiPaymentGoods 实例对象
     * @return 实例对象
     */
    FiPaymentGoods insert(FiPaymentGoods fiPaymentGoods);

    /**
     * 修改数据
     *
     * @param fiPaymentGoods 实例对象
     * @return 实例对象
     */
    FiPaymentGoods update(FiPaymentGoods fiPaymentGoods);

    /**
     * 通过主键删除数据
     *
     * @param pgId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pgId);

}
