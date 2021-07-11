package com.logistics.service;

import com.logistics.entity.FiAdvancCharge;

import java.util.List;

/**
 * (FiAdvancCharge)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 16:42:54
 */
public interface FiAdvancChargeService {

    /**
     * 通过ID查询单条数据
     *
     * @param acId 主键
     * @return 实例对象
     */
    FiAdvancCharge queryById(Integer acId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FiAdvancCharge> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param fiAdvancCharge 实例对象
     * @return 实例对象
     */
    FiAdvancCharge insert(FiAdvancCharge fiAdvancCharge);

    /**
     * 修改数据
     *
     * @param fiAdvancCharge 实例对象
     * @return 实例对象
     */
    FiAdvancCharge update(FiAdvancCharge fiAdvancCharge);

    /**
     * 通过主键删除数据
     *
     * @param acId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer acId);

}
