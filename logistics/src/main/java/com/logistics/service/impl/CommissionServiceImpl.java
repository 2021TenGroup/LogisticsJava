package com.logistics.service.impl;

import com.logistics.entity.Commission;
import com.logistics.dao.CommissionDao;
import com.logistics.service.CommissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Commission)表服务实现类
 *
 * @author makejava
 * @since 2021-07-13 11:15:20
 */
@Service("commissionService")
public class CommissionServiceImpl implements CommissionService {
    @Resource
    private CommissionDao commissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param comId 主键
     * @return 实例对象
     */
    @Override
    public Commission queryById(Integer comId) {
        return this.commissionDao.queryById(comId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Commission> queryAllByLimit(int offset, int limit) {
        return this.commissionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param commission 实例对象
     * @return 实例对象
     */
    @Override
    public Commission insert(Commission commission) {
        this.commissionDao.insert(commission);
        return commission;
    }

    /**
     * 修改数据
     *
     * @param commission 实例对象
     * @return 实例对象
     */
    @Override
    public Commission update(Commission commission) {
        this.commissionDao.update(commission);
        return this.queryById(commission.getComId());
    }

    /**
     * 通过主键删除数据
     *
     * @param comId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer comId) {
        return this.commissionDao.deleteById(comId) > 0;
    }

    //根据网点ID查询
    @Override
    public Commission queryByOutletsId(Integer outletsId){
        return commissionDao.queryByOutletsId(outletsId);
    }

}
