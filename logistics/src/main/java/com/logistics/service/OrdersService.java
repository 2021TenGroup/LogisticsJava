package com.logistics.service;

import com.logistics.entity.Orders;
import com.logistics.entity.OrdersAll;

import java.util.List;

/**
 * (Orders)表服务接口
 *
 * @author makejava
 * @since 2021-07-13 04:36:31
 */
public interface OrdersService {

    /**
     * 通过ID查询单条数据
     *
     * @param oId 主键
     * @return 实例对象
     */
    Orders queryById(Integer oId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Orders> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orders 实例对象
     * @return 实例对象
     */
    Orders insert(Orders orders);

    /**
     * 修改数据
     *
     * @param orders 实例对象
     * @return 实例对象
     */
    Orders update(Orders orders);

    /**
     * 通过主键删除数据
     *
     * @param oId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer oId);

    //查询所有的未录入的订单信息
    List<Orders> selAllOrders();
    //查询所有未录入和已录入的订单信息
    List<Orders> selAllOrdersAndwaybill();
    // 插入订单信息
    int addOrders(OrdersAll ordersAll);
    // 删除订单
    int deleteByOrders(Orders orders);
    //修改录入
    int updOrdersW(OrdersAll ordersAll);

}
