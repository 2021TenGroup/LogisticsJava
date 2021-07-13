package com.logistics.service.impl;

import com.logistics.entity.Warehous;
import com.logistics.dao.WarehousDao;
import com.logistics.service.WarehousService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Warehous)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 17:11:15
 */
@Service("warehousService")
public class WarehousServiceImpl implements WarehousService {
    @Resource
    private WarehousDao warehousDao;

    /**
     * 通过运单号查询入库数据
     */
    @Override
    public Warehous queryById(int waybillId) {
        return this.warehousDao.queryById(waybillId);
    }

    @Override
    public Warehous queryAllByBill(int waybillId) {
         return warehousDao.queryByIdOut(waybillId);

    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Warehous> queryAllByLimit(int offset, int limit) {
        return this.warehousDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Warehous> queryAll() {
        return warehousDao.queryAll();
    }

    @Override
    public List<Warehous> queryAllOut() {
        return warehousDao.queryAllOut();
    }

    /**
     * 入库
     * 入库必须字段有：
     * 1.入库编码（自动生成）
     * 2.运单id
     * 3.入库网点id（当前网点id）
     * 4.入库时间（当前时间）
     * 5.入库人：当前登录职员
     *
     */
    @Override
    public int insert(Warehous warehous) {

        this.warehousDao.insert(warehous);
        return 1;
    }
    /**
     * 出库
     * 出库必须字段有：
     * 通过运单号出库
     * 1.出库编码（自动生成）
     * 2.出库网点id
     * 3.出库时间（当前登录职员）
     * 4.出库人：当前登录职员
     *
     */
    @Override
    @Transactional
    public int update(Warehous warehous) {
//        warehous.setTimeliness(0);
        return this.warehousDao.update(warehous);
//       / return this.queryById(warehous.getWarehousId());
    }

    /**
     * 通过主键删除数据
     *
     * @param warehousId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer warehousId) {
        return this.warehousDao.deleteById(warehousId) > 0;
    }
}
