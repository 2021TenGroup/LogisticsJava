package com.logistics.dao;

import com.logistics.entity.NumberRule;
import com.logistics.vo.NumberRuleVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (NumberRule)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 19:20:12
 */
@Mapper
public interface NumberRuleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param ruleId 主键
     * @return 实例对象
     */
    NumberRule queryById(Integer ruleId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<NumberRule> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param numberRule 实例对象
     * @return 对象列表
     */
    List<NumberRule> queryAll(NumberRule numberRule);

    /**
     * 新增数据
     *
     * @param numberRuleVo 实例对象
     * @return 影响行数
     */
    int insert(NumberRuleVo numberRuleVo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<NumberRule> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<NumberRule> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<NumberRule> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<NumberRule> entities);

    /**
     * 修改数据
     *
     * @param numberRuleVo 实例对象
     * @return 影响行数
     */
    int update(NumberRuleVo numberRuleVo);

    /**
     * 通过主键删除数据
     *
     * @param ruleId 主键
     * @return 影响行数
     */
    int deleteById(Integer ruleId);

    List<NumberRuleVo> selectAllNumberRule();

    int deleteByNumberRule(NumberRuleVo numberRuleVo);
}

