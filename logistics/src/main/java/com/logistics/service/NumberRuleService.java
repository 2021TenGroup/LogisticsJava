package com.logistics.service;

import com.logistics.entity.NumberRule;
import com.logistics.vo.NumberRuleVo;

import java.util.List;

/**
 * (NumberRule)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 19:20:13
 */
public interface NumberRuleService {

    /**
     * 通过ID查询单条数据
     *
     * @param ruleId 主键
     * @return 实例对象
     */
    NumberRule queryById(Integer ruleId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<NumberRule> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param numberRule 实例对象
     * @return 实例对象
     */
    NumberRule insert(NumberRule numberRule);

    /**
     * 修改数据
     *
     * @param numberRule 实例对象
     * @return 实例对象
     */
    NumberRule update(NumberRule numberRule);

    /**
     * 通过主键删除数据
     *
     * @param ruleId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer ruleId);

    List<NumberRuleVo> selectAllNumberRule();

    int deleteByNumberRule(NumberRuleVo numberRuleVo);

    void addNumberRule(NumberRuleVo numberRuleVo);

    int updateNumberRule(NumberRuleVo numberRuleVo);
}
