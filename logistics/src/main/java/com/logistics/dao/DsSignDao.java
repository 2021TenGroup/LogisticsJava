package com.logistics.dao;

import com.logistics.entity.DsSign;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (DsSign)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-13 09:04:52
 */
@Mapper
public interface DsSignDao {

    /**
     * 通过ID查询单条数据
     *
     * @param signId 主键
     * @return 实例对象
     */
    DsSign queryById(Integer signId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<DsSign> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dsSign 实例对象
     * @return 对象列表
     */
    List<DsSign> queryAll(DsSign dsSign);

    /**
     * 新增数据
     *
     * @param dsSign 实例对象
     * @return 影响行数
     */
    int insert(DsSign dsSign);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<DsSign> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<DsSign> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<DsSign> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<DsSign> entities);

    /**
     * 修改数据
     *
     * @param dsSign 实例对象
     * @return 影响行数
     */
    int update(DsSign dsSign);

    /**
     * 通过主键删除数据
     *
     * @param signId 主键
     * @return 影响行数
     */
    int deleteById(Integer signId);

}

