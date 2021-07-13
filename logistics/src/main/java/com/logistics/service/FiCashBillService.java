package com.logistics.service;

import com.logistics.entity.DsWaybillEntrt;
import com.logistics.entity.FiCashBill;

import java.util.List;

/**
 * (FiCashBill)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 02:51:53
 */
public interface FiCashBillService {

    /**
     * 通过ID查询单条数据
     *
     * @param cbId 主键
     * @return 实例对象
     */
    FiCashBill queryById(Integer cbId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FiCashBill> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param fiCashBill 实例对象
     * @return 实例对象
     */
    FiCashBill insert(FiCashBill fiCashBill);

    /**
     * 修改数据
     *
     * @param fiCashBill 实例对象
     * @return 实例对象
     */
    FiCashBill update(FiCashBill fiCashBill);

    /**
     * 通过主键删除数据
     *
     * @param cbId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cbId);

    List<FiCashBill> queryAll(FiCashBill fiCashBill);

    /**
     * 运单录入时，添加运费帐单表
     */
    int addFiCashBill(DsWaybillEntrt dsWaybillEntrtEntity);

    /**
     * 当签收之后，改变收取状态
     */
    int updateCashBillState(DsWaybillEntrt dsWaybillEntrtEntity);

}
