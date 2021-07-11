package com.logistics.service.impl;

import com.logistics.entity.DsSign;
import com.logistics.dao.DsSignDao;
import com.logistics.service.DsSignService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 签收录入表(DsSign)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 19:37:35
 */
@Service("dsSignService")
public class DsSignServiceImpl implements DsSignService {
    @Resource
    private DsSignDao dsSignDao;

    /**
     * 通过ID查询单条数据
     *
     * @param signId 主键
     * @return 实例对象
     */
    @Override
    public DsSign queryById(Integer signId) {
        return this.dsSignDao.queryById(signId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DsSign> queryAllByLimit(int offset, int limit) {
        return this.dsSignDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dsSign 实例对象
     * @return 实例对象
     */
    @Override
    public DsSign insert(DsSign dsSign) {

        this.dsSignDao.insert(dsSign);
        return dsSign;
    }

    /**
     * 修改数据
     *
     * @param dsSign 实例对象
     * @return 实例对象
     */
    @Override
    public DsSign update(DsSign dsSign) {
        this.dsSignDao.update(dsSign);
        return this.queryById(dsSign.getSignId());
    }

    /**
     * 通过主键删除数据
     *
     * @param signId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer signId) {
        return this.dsSignDao.deleteById(signId) > 0;
    }

    @Override
    public List<DsSign> queryAll(DsSign dsSign) {
        return this.dsSignDao.queryAll(dsSign);
    }
}