package com.logistics.service.impl;

<<<<<<< HEAD
import com.logistics.entity.Outlets;
import com.logistics.dao.OutletsDao;
import com.logistics.service.OutletsService;
import org.springframework.stereotype.Service;
=======
import com.logistics.dao.OutletsDao;
import com.logistics.entity.Outlets;
import com.logistics.service.OutletsService;
import com.logistics.vo.OutletsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3

import javax.annotation.Resource;
import java.util.List;

<<<<<<< HEAD
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

    @Override
    public Outlets queryByOutletsName(String outletsName){
        return outletsDao.queryByOutletsName(outletsName);
    }

=======
@Service
@Slf4j
public class OutletsServiceImpl implements OutletsService {
    @Resource
    private OutletsDao outletsDao;
    @Override
    public Outlets queryById(Integer outletsId) {
        return null;
    }

    @Override
    public List<Outlets> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    @Transactional
    public Outlets insert(Outlets outlets) {
        return null;
    }

    @Override
    @Transactional
    public Outlets update(Outlets outlets) {
        return null;
    }

    @Override
    @Transactional
    public boolean deleteById(Integer outletsId) {
        return false;
    }

    @Override
    public List<OutletsVo> selectAllOutlets() {
        return outletsDao.selectAllOutlets();
    }

    @Override
    @Transactional
    public void addOutlets(OutletsVo outletsVo) {
        outletsDao.insert(outletsVo);
    }

    @Override
    @Transactional
    public int updateOutlets(OutletsVo outletsVo) {
        return outletsDao.update(outletsVo);
    }

    @Override
    @Transactional
    public int delOutletsVo(OutletsVo outletsVo) {
        return outletsDao.deleteByOutlets(outletsVo);
    }

    @Override
    public OutletsVo selectOutletsById(int id) {
        return outletsDao.queryById(id);
    }
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3
}
