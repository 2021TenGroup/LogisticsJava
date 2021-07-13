package com.logistics.service.impl;

import com.logistics.dao.NumberRuleDao;
import com.logistics.entity.NumberRule;
import com.logistics.service.NumberRuleService;
import com.logistics.vo.NumberRuleVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class NumberRuleServiceImpl implements NumberRuleService {
    @Resource
    private NumberRuleDao numberRuleDao;
    @Override
    public NumberRule queryById(Integer ruleId) {
        return null;
    }

    @Override
    public List<NumberRule> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    @Transactional
    public NumberRule insert(NumberRule numberRule) {
        return null;
    }

    @Override
    @Transactional
    public NumberRule update(NumberRule numberRule) {
        return null;
    }

    @Override
    @Transactional
    public boolean deleteById(Integer ruleId) {
        return false;
    }

    @Override
    public List<NumberRuleVo> selectAllNumberRule() {
        return numberRuleDao.selectAllNumberRule();
    }

    @Override
    @Transactional
    public int deleteByNumberRule(NumberRuleVo numberRuleVo) {
        return numberRuleDao.deleteByNumberRule(numberRuleVo);
    }

    @Override
    @Transactional
    public void addNumberRule(NumberRuleVo numberRuleVo) {
        numberRuleDao.insert(numberRuleVo);
    }

    @Override
    @Transactional
    public int updateNumberRule(NumberRuleVo numberRuleVo) {
        return numberRuleDao.update(numberRuleVo);
    }
}
