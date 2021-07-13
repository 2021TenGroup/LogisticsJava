package com.logistics.service;

import com.logistics.entity.Types;

import java.util.List;

/**
 * (Types)表服务接口
 *
 * @author makejava
 * @since 2021-07-13 11:07:55
 */
public interface TypesService {

    /**
     * 通过ID查询单条数据
     *
     * @param typeId 主键
     * @return 实例对象
     */
    Types queryById(Integer typeId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Types> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param types 实例对象
     * @return 实例对象
     */
    Types insert(Types types);

    /**
     * 修改数据
     *
     * @param types 实例对象
     * @return 实例对象
     */
    Types update(Types types);

    /**
     * 通过主键删除数据
     *
     * @param typeId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer typeId);

    //根据名称查询
    Types queryByTypeName(String typeName);

    //添加一条类型维护
    int addTypes(Types types);

    //修改一条类型维护
    int updTypes(Integer typeId);

    //查询所有类型维护数据
    List<Types> selAllTypes();

    //删除一条类型维护
    int deleteByTypes(Types types);

}
