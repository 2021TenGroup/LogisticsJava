package com.logistics.dao;

import com.logistics.entity.Numberlssue;
import com.logistics.vo.NumberlssueVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Numberlssue)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 19:35:29
 */
@Mapper
public interface NumberlssueDao {

    /**
     * 通过ID查询单条数据
     *
     * @param numberlssueId 主键
     * @return 实例对象
     */
    Numberlssue queryById(Integer numberlssueId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Numberlssue> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param numberlssue 实例对象
     * @return 对象列表
     */
    List<Numberlssue> queryAll(Numberlssue numberlssue);

    /**
     * 新增数据
     *
     * @param numberlssueVo 实例对象
     * @return 影响行数
     */
    int insert(NumberlssueVo numberlssueVo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Numberlssue> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Numberlssue> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Numberlssue> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Numberlssue> entities);

    /**
     * 修改数据
     *
     * @param numberlssueVo 实例对象
     * @return 影响行数
     */
    int update(NumberlssueVo numberlssueVo);

    /**
     * 通过主键删除数据
     *
     * @param numberlssueId 主键
     * @return 影响行数
     */
    int deleteById(Integer numberlssueId);

    List<NumberlssueVo> selectAllNumberLssue();

    int deleteByNumberLssue(NumberlssueVo numberlssueVo);
}

