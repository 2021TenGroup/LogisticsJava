package com.logistics.dao;

import com.logistics.entity.Warehous;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Warehous)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 17:11:13
 */
@Mapper
public interface WarehousDao {

    /**
     * 通过ID查询单条数据
     *
     * @param warehousId 主键
     * @return 实例对象
     */
    Warehous queryById(Integer warehousId);


    Warehous queryByIdOut(int waybillId);


    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Warehous> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 查询所有
     */
    List<Warehous> queryAll();

    /**
     * 查询所有出库信息
     * @param =
     * @return
     */
    List<Warehous> queryAllOut();


    /*
     * 入库
     */
    int insert(Warehous warehous);

    /*
    出库
     */
    int insertOutBywaybillId(Warehous warehous,int waybillId);




    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Warehous> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Warehous> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Warehous> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Warehous> entities);

    /**
     * 修改数据
     *
     * @param warehous 实例对象
     * @return 影响行数
     */


    int update(Warehous warehous);


    int deleteById(Integer warehousId);


    Warehous queryAllByBill(int waybillId);

}

