package com.logistics.service;

import com.logistics.entity.PerPosition;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (PerPosition)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 17:00:01
 */
public interface PerPositionService {

    /**
     * 通过ID查询单条数据
     *
     * @param positionId 主键
     * @return 实例对象
     */
    PerPosition queryById(Integer positionId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<PerPosition> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param perPosition 实例对象
     * @return 实例对象
     */
    PerPosition insert(PerPosition perPosition);

    /**
     * 修改数据
     *
     * @param perPosition 实例对象
     * @return 实例对象
     */
    PerPosition update(PerPosition perPosition);

    /**
     * 通过主键删除数据
     *
     * @param positionId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer positionId);

}
