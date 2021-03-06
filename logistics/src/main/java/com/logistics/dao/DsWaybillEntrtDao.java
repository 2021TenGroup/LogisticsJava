package com.logistics.dao;

import com.logistics.entity.DsWaybillEntrt;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (DsWaybillEntrt)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-13 04:39:24
 */
@Mapper
public interface DsWaybillEntrtDao {

    /**
     * 通过ID查询单条数据
     *
     * @param waybillId 主键
     * @return 实例对象
     */
    DsWaybillEntrt queryById(Integer waybillId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<DsWaybillEntrt> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dsWaybillEntrt 实例对象
     * @return 对象列表
     */
    List<DsWaybillEntrt> queryAll(DsWaybillEntrt dsWaybillEntrt);

    /**
     * 新增数据
     *
     * @param dsWaybillEntrt 实例对象
     * @return 影响行数
     */
    int insert(DsWaybillEntrt dsWaybillEntrt);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<DsWaybillEntrt> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<DsWaybillEntrt> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<DsWaybillEntrt> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<DsWaybillEntrt> entities);

    /**
     * 修改数据
     *
     * @param dsWaybillEntrt 实例对象
     * @return 影响行数
     */
    int update(DsWaybillEntrt dsWaybillEntrt);

    /**
     * 通过主键删除数据
     *
     * @param waybillId 主键
     * @return 影响行数
     */
    int deleteById(Integer waybillId);

    /**
     * 根据网点编号查询
     */
    DsWaybillEntrt queryByWaybillNumber(String waybillNumber);

}

