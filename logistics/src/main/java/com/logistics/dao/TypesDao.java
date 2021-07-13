package com.logistics.dao;

import com.logistics.entity.Types;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Types)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-13 11:07:55
 */
@Mapper
public interface TypesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param typeId 主键
     * @return 实例对象
     */
    Types queryById(Integer typeId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Types> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param types 实例对象
     * @return 对象列表
     */
    List<Types> queryAll(Types types);

    /**
     * 新增数据
     *
     * @param types 实例对象
     * @return 影响行数
     */
    int insert(Types types);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Types> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Types> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Types> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Types> entities);

    /**
     * 修改数据
     *
     * @param types 实例对象
     * @return 影响行数
     */
    int update(Types types);

    /**
     * 通过主键删除数据
     *
     * @param typeId 主键
     * @return 影响行数
     */
    int deleteById(Integer typeId);

    /**
     * 根据名称查询
     */
    Types queryByTypesName(String typeName);

    //添加一条类型维护
    int addTypes(Types types);

    //修改一条类型维护
    int updTypes(Integer typeId);

    //查询所有类型维护数据
    List<Types> selAllTypes();

    //删除一条类型维护
    int deleteByTypes(Types types);

}

