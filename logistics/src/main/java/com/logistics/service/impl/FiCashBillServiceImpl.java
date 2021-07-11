package com.logistics.service.impl;

import com.logistics.entity.FiCashBill;
import com.logistics.dao.FiCashBillDao;
import com.logistics.service.FiCashBillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FiCashBill)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 16:42:57
 */
@Service("fiCashBillService")
public class FiCashBillServiceImpl implements FiCashBillService {
    @Resource
    private FiCashBillDao fiCashBillDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cbId 主键
     * @return 实例对象
     */
    @Override
    public FiCashBill queryById(Integer cbId) {
        return this.fiCashBillDao.queryById(cbId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FiCashBill> queryAllByLimit(int offset, int limit) {
        return this.fiCashBillDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param fiCashBill 实例对象
     * @return 实例对象
     */
    @Override
    public FiCashBill insert(FiCashBill fiCashBill) {
        this.fiCashBillDao.insert(fiCashBill);
        return fiCashBill;
    }

    /**
     * 修改数据
     *
     * @param fiCashBill 实例对象
     * @return 实例对象
     */
    @Override
    public FiCashBill update(FiCashBill fiCashBill) {
        this.fiCashBillDao.update(fiCashBill);
        return this.queryById(fiCashBill.getCbId());
    }

    /**
     * 通过主键删除数据
     *
     * @param cbId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cbId) {
        return this.fiCashBillDao.deleteById(cbId) > 0;
    }
}
