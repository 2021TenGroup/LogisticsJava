package com.logistics.service;

import com.logistics.entity.Commission;

import java.util.List;

/**
 * (Commission)表服务接口
 *
 * @author makejava
 * @since 2021-07-13 11:15:19
 */
public interface CommissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param comId 主键
     * @return 实例对象
     */
    Commission queryById(Integer comId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Commission> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param commission 实例对象
     * @return 实例对象
     */
    Commission insert(Commission commission);

    /**
     * 修改数据
     *
     * @param commission 实例对象
     * @return 实例对象
     */
    Commission update(Commission commission);

    /**
     * 通过主键删除数据
     *
     * @param comId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer comId);

    //根据网点ID查询
    Commission queryByOutletsId(Integer outletsId);

}
