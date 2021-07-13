package com.logistics.dao;

import com.logistics.entity.Commission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Commission)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-13 11:15:19
 */
@Mapper
public interface CommissionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param comId 主键
     * @return 实例对象
     */
    Commission queryById(Integer comId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Commission> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param commission 实例对象
     * @return 对象列表
     */
    List<Commission> queryAll(Commission commission);

    /**
     * 新增数据
     *
     * @param commission 实例对象
     * @return 影响行数
     */
    int insert(Commission commission);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Commission> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Commission> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Commission> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Commission> entities);

    /**
     * 修改数据
     *
     * @param commission 实例对象
     * @return 影响行数
     */
    int update(Commission commission);

    /**
     * 通过主键删除数据
     *
     * @param comId 主键
     * @return 影响行数
     */
    int deleteById(Integer comId);

    Commission queryByOutletsId(Integer outletsId);

}

