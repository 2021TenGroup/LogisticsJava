package com.logistics.service.impl;

import com.logistics.dao.OutletsDao;
import com.logistics.entity.Outlets;
import com.logistics.service.OutletsService;
import com.logistics.vo.OutletsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

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

}
