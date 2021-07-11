package com.logistics.service;

import com.logistics.entity.FiMoneyDetailed;

import java.util.List;

/**
 * (FiMoneyDetailed)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 16:42:58
 */
public interface FiMoneyDetailedService {

    /**
     * 通过ID查询单条数据
     *
     * @param mdId 主键
     * @return 实例对象
     */
    FiMoneyDetailed queryById(Integer mdId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FiMoneyDetailed> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param fiMoneyDetailed 实例对象
     * @return 实例对象
     */
    FiMoneyDetailed insert(FiMoneyDetailed fiMoneyDetailed);

    /**
     * 修改数据
     *
     * @param fiMoneyDetailed 实例对象
     * @return 实例对象
     */
    FiMoneyDetailed update(FiMoneyDetailed fiMoneyDetailed);

    /**
     * 通过主键删除数据
     *
     * @param mdId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer mdId);

}
