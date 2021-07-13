package com.logistics.dao;

import com.logistics.entity.Emp;
<<<<<<< HEAD
=======
import com.logistics.vo.EmpVo;
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
<<<<<<< HEAD
 * (Emp)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-13 04:36:28
=======
 * (EmpVo)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 16:35:38
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3
 */
@Mapper
public interface EmpDao {

    /**
     * 通过ID查询单条数据
     *
     * @param empId 主键
     * @return 实例对象
     */
    Emp queryById(Integer empId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Emp> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param emp 实例对象
     * @return 对象列表
     */
    List<Emp> queryAll(Emp emp);

    /**
     * 新增数据
     *
<<<<<<< HEAD
     * @param emp 实例对象
     * @return 影响行数
     */
    int insert(Emp emp);
=======
     * @param empVo 实例对象
     * @return 影响行数
     */
    int insert(EmpVo empVo);
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
<<<<<<< HEAD
     * @param entities List<Emp> 实例对象列表
=======
     * @param entities List<EmpVo> 实例对象列表
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Emp> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
<<<<<<< HEAD
     * @param entities List<Emp> 实例对象列表
=======
     * @param entities List<EmpVo> 实例对象列表
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Emp> entities);

    /**
     * 修改数据
     *
<<<<<<< HEAD
     * @param emp 实例对象
     * @return 影响行数
     */
    int update(Emp emp);
=======
     * @param empVo 实例对象
     * @return 影响行数
     */
    int update(EmpVo empVo);
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3

    /**
     * 通过主键删除数据
     *
     * @param empId 主键
     * @return 影响行数
     */
    int deleteById(Integer empId);

<<<<<<< HEAD
=======
    List<EmpVo> selectAllEmps();

    int deleteByEmps(EmpVo empVo);
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3
}

