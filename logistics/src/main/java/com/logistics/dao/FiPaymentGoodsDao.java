package com.logistics.dao;

import com.logistics.entity.FiPaymentGoods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (FiPaymentGoods)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 02:32:09
 */
@Mapper
public interface FiPaymentGoodsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pgId 主键
     * @return 实例对象
     */
    FiPaymentGoods queryById(Integer pgId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FiPaymentGoods> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param fiPaymentGoods 实例对象
     * @return 对象列表
     */
    List<FiPaymentGoods> queryAll(FiPaymentGoods fiPaymentGoods);

    /**
     * 新增数据
     *
     * @param fiPaymentGoods 实例对象
     * @return 影响行数
     */
    int insert(FiPaymentGoods fiPaymentGoods);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<FiPaymentGoods> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<FiPaymentGoods> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<FiPaymentGoods> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<FiPaymentGoods> entities);

    /**
     * 修改数据
     *
     * @param fiPaymentGoods 实例对象
     * @return 影响行数
     */
    int update(FiPaymentGoods fiPaymentGoods);

    /**
     * 通过主键删除数据
     *
     * @param pgId 主键
     * @return 影响行数
     */
    int deleteById(Integer pgId);

    /**
     * 根据运单ID查询
     */
    FiPaymentGoods queryByWaybillId(Integer waybillId);

    /**
     * 点击发放
     * 改变时效性，1则不可以再发放
     */
    int updateTimeliness(@Param("PgId") Integer PgId);

}

