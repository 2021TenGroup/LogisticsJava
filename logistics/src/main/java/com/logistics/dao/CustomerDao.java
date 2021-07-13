package com.logistics.dao;

import com.logistics.entity.Customer;
import com.logistics.vo.CustomerVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Customer)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 15:28:25
 */
@Mapper
public interface CustomerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param customerId 主键
     * @return 实例对象
     */
    Customer queryById(Integer customerId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Customer> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param customer 实例对象
     * @return 对象列表
     */
    List<Customer> queryAll(Customer customer);

    /**
     * 新增数据
     *
     * @param customerVo 实例对象
     * @return 影响行数
     */
    int insert(CustomerVo customerVo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Customer> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Customer> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Customer> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Customer> entities);

    /**
     * 修改数据
     *
     * @param customerVo 实例对象
     * @return 影响行数
     */
    int update(CustomerVo customerVo);

    /**
     * 通过主键删除数据
     *
     * @param customerId 主键
     * @return 影响行数
     */
    int deleteById(Integer customerId);

    List<CustomerVo> selectAllCustomer();

    int deleteByCustomer(CustomerVo customerVo);

    List<CustomerVo> selectAllCustomer2(String value);

    List<CustomerVo> selectAllCustomer3(Integer state,String value);
}

