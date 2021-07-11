package com.logistics.dao;

import com.logistics.entity.FiRecharge;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (FiRecharge)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 16:42:59
 */
@Mapper
public interface FiRechargeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param reId 主键
     * @return 实例对象
     */
    FiRecharge queryById(Integer reId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FiRecharge> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param fiRecharge 实例对象
     * @return 对象列表
     */
    List<FiRecharge> queryAll(FiRecharge fiRecharge);

    /**
     * 新增数据
     *
     * @param fiRecharge 实例对象
     * @return 影响行数
     */
    int insert(FiRecharge fiRecharge);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<FiRecharge> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<FiRecharge> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<FiRecharge> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<FiRecharge> entities);

    /**
     * 修改数据
     *
     * @param fiRecharge 实例对象
     * @return 影响行数
     */
    int update(FiRecharge fiRecharge);

    /**
     * 通过主键删除数据
     *
     * @param reId 主键
     * @return 影响行数
     */
    int deleteById(Integer reId);

}

