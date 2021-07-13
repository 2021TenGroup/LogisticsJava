package com.logistics.service.impl;

import com.logistics.entity.Outlets;
import com.logistics.dao.OutletsDao;
import com.logistics.service.OutletsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Outlets)表服务实现类
 *
 * @author makejava
 * @since 2021-07-13 04:36:31
 */
@Service("outletsService")
public class OutletsServiceImpl implements OutletsService {
    @Resource
    private OutletsDao outletsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param outletsId 主键
     * @return 实例对象
     */
    @Override
    public Outlets queryById(Integer outletsId) {
        return this.outletsDao.queryById(outletsId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Outlets> queryAllByLimit(int offset, int limit) {
        return this.outletsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param outlets 实例对象
     * @return 实例对象
     */
    @Override
    public Outlets insert(Outlets outlets) {
        this.outletsDao.insert(outlets);
        return outlets;
    }

    /**
     * 修改数据
     *
     * @param outlets 实例对象
     * @return 实例对象
     */
    @Override
    public Outlets update(Outlets outlets) {
        this.outletsDao.update(outlets);
        return this.queryById(outlets.getOutletsId());
    }

    /**
     * 通过主键删除数据
     *
     * @param outletsId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer outletsId) {
        return this.outletsDao.deleteById(outletsId) > 0;
    }
}
