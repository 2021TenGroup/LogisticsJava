package com.logistics.service.impl;

import com.logistics.dao.NumberRuleDao;
import com.logistics.dao.NumberlssueDao;
import com.logistics.entity.Numberlssue;
import com.logistics.service.NumberlssueService;
import com.logistics.vo.NumberlssueVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NumberlssueServiceImpl implements NumberlssueService {
    @Resource
    private NumberlssueDao numberlssueDao;
    @Override
    public Numberlssue queryById(Integer numberlssueId) {
        return null;
    }

    @Override
    public List<Numberlssue> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    @Transactional
    public Numberlssue insert(Numberlssue numberlssue) {
        return null;
    }

    @Override
    @Transactional
    public Numberlssue update(Numberlssue numberlssue) {
        return null;
    }

    @Override
    @Transactional
    public boolean deleteById(Integer numberlssueId) {
        return false;
    }

    @Override
    public List<NumberlssueVo> selectAllNumberLssue() {
        return numberlssueDao.selectAllNumberLssue();
    }

    @Override
    @Transactional
    public int deleteByNumberLssue(NumberlssueVo numberlssueVo) {
        return numberlssueDao.deleteByNumberLssue(numberlssueVo);
    }

    @Override
    @Transactional
    public void addNumberLssue(NumberlssueVo numberlssueVo) {
        numberlssueDao.insert(numberlssueVo);
    }

    @Override
    @Transactional
    public int updateNumberLssue(NumberlssueVo numberlssueVo) {
        return numberlssueDao.update(numberlssueVo);
    }
}
