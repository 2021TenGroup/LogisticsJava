package com.logistics.service.impl;

import com.logistics.entity.DsWaybillEntrt;
import com.logistics.dao.DsWaybillEntrtDao;
import com.logistics.service.DsWaybillEntrtService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DsWaybillEntrt)表服务实现类
 *
 * @author makejava
 * @since 2021-07-13 04:39:24
 */
@Service("dsWaybillEntrtService")
public class DsWaybillEntrtServiceImpl implements DsWaybillEntrtService {
    @Resource
    private DsWaybillEntrtDao dsWaybillEntrtDao;

    /**
     * 通过ID查询单条数据
     *
     * @param waybillId 主键
     * @return 实例对象
     */
    @Override
    public DsWaybillEntrt queryById(Integer waybillId) {
        return this.dsWaybillEntrtDao.queryById(waybillId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<DsWaybillEntrt> queryAllByLimit(int offset, int limit) {
        return this.dsWaybillEntrtDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dsWaybillEntrt 实例对象
     * @return 实例对象
     */
    @Override
    public DsWaybillEntrt insert(DsWaybillEntrt dsWaybillEntrt) {
        this.dsWaybillEntrtDao.insert(dsWaybillEntrt);
        return dsWaybillEntrt;
    }

    /**
     * 修改数据
     *
     * @param dsWaybillEntrt 实例对象
     * @return 实例对象
     */
    @Override
    public DsWaybillEntrt update(DsWaybillEntrt dsWaybillEntrt) {
        this.dsWaybillEntrtDao.update(dsWaybillEntrt);
        return this.queryById(dsWaybillEntrt.getWaybillId());
    }

    /**
     * 通过主键删除数据
     *
     * @param waybillId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer waybillId) {
        return this.dsWaybillEntrtDao.deleteById(waybillId) > 0;
    }

    /**
     * 根据网点编号查询
     */
    @Override
    public DsWaybillEntrt queryByWaybillNumber(String waybillNumber){
        return dsWaybillEntrtDao.queryByWaybillNumber(waybillNumber);
    }


}
