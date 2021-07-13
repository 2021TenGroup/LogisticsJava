package com.logistics.service;

import com.logistics.entity.DsWaybillEntrt;

import java.util.List;

/**
 * (DsWaybillEntrt)表服务接口
 *
 * @author makejava
 * @since 2021-07-13 04:39:24
 */
public interface DsWaybillEntrtService {

    /**
     * 通过ID查询单条数据
     *
     * @param waybillId 主键
     * @return 实例对象
     */
    DsWaybillEntrt queryById(Integer waybillId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<DsWaybillEntrt> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param dsWaybillEntrt 实例对象
     * @return 实例对象
     */
    DsWaybillEntrt insert(DsWaybillEntrt dsWaybillEntrt);

    /**
     * 修改数据
     *
     * @param dsWaybillEntrt 实例对象
     * @return 实例对象
     */
    DsWaybillEntrt update(DsWaybillEntrt dsWaybillEntrt);

    /**
     * 通过主键删除数据
     *
     * @param waybillId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer waybillId);

}
