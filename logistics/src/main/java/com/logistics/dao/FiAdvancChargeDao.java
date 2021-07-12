package com.logistics.dao;

import com.logistics.entity.FiAdvancCharge;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 预付款表(FiAdvancCharge)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 17:45:06
 */
public interface FiAdvancChargeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param acId 主键
     * @return 实例对象
     */
    FiAdvancCharge queryById(Integer acId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FiAdvancCharge> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param fiAdvancCharge 实例对象
     * @return 对象列表
     */
    List<FiAdvancCharge> queryAll(FiAdvancCharge fiAdvancCharge);

    /**
     * 新增数据
     *
     * @param fiAdvancCharge 实例对象
     * @return 影响行数
     */
    int insert(FiAdvancCharge fiAdvancCharge);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<FiAdvancCharge> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<FiAdvancCharge> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<FiAdvancCharge> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<FiAdvancCharge> entities);

    /**
     * 修改数据
     *
     * @param fiAdvancCharge 实例对象
     * @return 影响行数
     */
    int update(FiAdvancCharge fiAdvancCharge);

    /**
     * 通过主键删除数据
     *
     * @param acId 主键
     * @return 影响行数
     */
    int deleteById(Integer acId);

}

