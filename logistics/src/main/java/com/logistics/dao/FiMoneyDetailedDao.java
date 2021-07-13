package com.logistics.dao;

import com.logistics.entity.FiMoneyDetailed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (FiMoneyDetailed)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 11:46:56
 */
@Mapper
public interface FiMoneyDetailedDao {

    /**
     * 通过ID查询单条数据
     *
     * @param mdId 主键
     * @return 实例对象
     */
    FiMoneyDetailed queryById(Integer mdId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FiMoneyDetailed> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param fiMoneyDetailed 实例对象
     * @return 对象列表
     */
    List<FiMoneyDetailed> queryAll(FiMoneyDetailed fiMoneyDetailed);

    /**
     * 新增数据
     *
     * @param fiMoneyDetailed 实例对象
     * @return 影响行数
     */
    int insert(FiMoneyDetailed fiMoneyDetailed);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<FiMoneyDetailed> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<FiMoneyDetailed> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<FiMoneyDetailed> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<FiMoneyDetailed> entities);

    /**
     * 修改数据
     *
     * @param fiMoneyDetailed 实例对象
     * @return 影响行数
     */
    int update(FiMoneyDetailed fiMoneyDetailed);

    /**
     * 通过主键删除数据
     *
     * @param mdId 主键
     * @return 影响行数
     */
    int deleteById(Integer mdId);

}
