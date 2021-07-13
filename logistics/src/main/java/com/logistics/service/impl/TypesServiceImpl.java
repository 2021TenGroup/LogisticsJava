package com.logistics.service.impl;

import com.logistics.entity.Types;
import com.logistics.dao.TypesDao;
import com.logistics.service.TypesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Types)表服务实现类
 *
 * @author makejava
 * @since 2021-07-13 11:07:55
 */
@Service("typesService")
public class TypesServiceImpl implements TypesService {
    @Resource
    private TypesDao typesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param typeId 主键
     * @return 实例对象
     */
    @Override
    public Types queryById(Integer typeId) {
        return this.typesDao.queryById(typeId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Types> queryAllByLimit(int offset, int limit) {
        return this.typesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param types 实例对象
     * @return 实例对象
     */
    @Override
    public Types insert(Types types) {
        this.typesDao.insert(types);
        return types;
    }

    /**
     * 修改数据
     *
     * @param types 实例对象
     * @return 实例对象
     */
    @Override
    public Types update(Types types) {
        this.typesDao.update(types);
        return this.queryById(types.getTypeId());
    }

    /**
     * 通过主键删除数据
     *
     * @param typeId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer typeId) {
        return this.typesDao.deleteById(typeId) > 0;
    }

    /**
     * 根据名称查询
     */
    @Override
    public Types queryByTypesName(String typeName){
        return typesDao.queryByTypesName(typeName);
    }

}
