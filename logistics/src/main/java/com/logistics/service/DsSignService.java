package com.logistics.service;

import com.logistics.entity.DsSign;

import java.util.List;

/**
 * (DsSign)表服务接口
 *
 * @author makejava
 * @since 2021-07-13 09:04:53
 */
public interface DsSignService {

    /**
     * 通过ID查询单条数据
     *
     * @param signId 主键
     * @return 实例对象
     */
    DsSign queryById(Integer signId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<DsSign> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param dsSign 实例对象
     * @return 实例对象
     */
    DsSign insert(DsSign dsSign);

    /**
     * 修改数据
     *
     * @param dsSign 实例对象
     * @return 实例对象
     */
    DsSign update(DsSign dsSign);

    /**
     * 通过主键删除数据
     *
     * @param signId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer signId);

}
