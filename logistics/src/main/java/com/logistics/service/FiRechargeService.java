package com.logistics.service;

import com.logistics.entity.FiRecharge;

import java.util.List;

/**
 * (FiRecharge)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 16:43:00
 */
public interface FiRechargeService {

    /**
     * 通过ID查询单条数据
     *
     * @param reId 主键
     * @return 实例对象
     */
    FiRecharge queryById(Integer reId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FiRecharge> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param fiRecharge 实例对象
     * @return 实例对象
     */
    FiRecharge insert(FiRecharge fiRecharge);

    /**
     * 修改数据
     *
     * @param fiRecharge 实例对象
     * @return 实例对象
     */
    FiRecharge update(FiRecharge fiRecharge);

    /**
     * 通过主键删除数据
     *
     * @param reId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer reId);

}
