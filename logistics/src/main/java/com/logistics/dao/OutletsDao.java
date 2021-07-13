package com.logistics.dao;

import com.logistics.entity.Outlets;
import com.logistics.vo.OutletsVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Outlets)表数据库访问层
 *
 * @author makejava
<<<<<<< HEAD
<<<<<<< HEAD
 * @since 2021-07-13 04:36:31
=======
 * @since 2021-07-11 14:38:03
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3
=======
 * @since 2021-07-11 14:38:03
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3
 */
@Mapper
public interface OutletsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param outletsId 主键
     * @return 实例对象
     */
    OutletsVo queryById(int outletsId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Outlets> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param outlets 实例对象
     * @return 对象列表
     */
    List<Outlets> queryAll(Outlets outlets);

    /**
     * 新增数据
     *
     * @param outletsVo 实例对象
     * @return 影响行数
     */
    int insert(OutletsVo outletsVo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Outlets> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Outlets> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Outlets> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Outlets> entities);

    /**
     * 修改数据
     *
     * @param outletsVo 实例对象
     * @return 影响行数
     */
    int update(OutletsVo outletsVo);

    /**
     * 通过主键删除数据
     *
     * @param outletsId 主键
     * @return 影响行数
     */
    int deleteById(Integer outletsId);

    /*
    * 查询所有
    * */
    List<OutletsVo> selectAllOutlets();

    int deleteByOutlets(OutletsVo outletsVo);
}

