package com.logistics.service;

import com.logistics.entity.Warehous;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * (Warehous)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 17:11:15
 */
public interface WarehousService {

    /**
     * 查询入库记录
     */
    Warehous queryById(int waybillId);


    Warehous queryAllByBill(int waybillId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Warehous> queryAllByLimit(int offset, int limit);


    List<Warehous> queryAll();


    List<Warehous> queryAllOut();

    /*
       入库
     */
    @Transactional
    int insert(Warehous warehous);

//    /*
//      出库
//     */
//    @Transactional
//    int insetOut(Warehous warehous);




    /**
     * 修改数据
     * 出库
     */
    int update(Warehous warehous);

    /**
     * 通过主键删除数据
     *
     * @param warehousId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer warehousId);

}
