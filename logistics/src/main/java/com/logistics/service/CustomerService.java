package com.logistics.service;

import com.logistics.entity.Customer;
import com.logistics.vo.CustomerVo;

import java.util.List;

/**
 * (Customer)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 15:28:26
 */
public interface CustomerService {

    /**
     * 通过ID查询单条数据
     *
     * @param customerId 主键
     * @return 实例对象
     */
    Customer queryById(Integer customerId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Customer> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    Customer insert(Customer customer);

    /**
     * 修改数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    Customer update(Customer customer);

    /**
     * 通过主键删除数据
     *
     * @param customerId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer customerId);

    List<CustomerVo> selectAllCustomer();

    void addCustomer(CustomerVo customerVo);

    int updateCustomer(CustomerVo customerVo);

    int delCustomer(CustomerVo customerVo);

}
