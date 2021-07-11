package com.logistics.service.impl;

import com.logistics.dao.CustomerDao;
import com.logistics.entity.Customer;
import com.logistics.service.CustomerService;
import com.logistics.vo.CustomerVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerDao customerDao;
    @Override
    public Customer queryById(Integer customerId) {
        return null;
    }

    @Override
    public List<Customer> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    @Transactional
    public Customer insert(Customer customer) {
        return null;
    }

    @Override
    @Transactional
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    @Transactional
    public boolean deleteById(Integer customerId) {
        return false;
    }

    @Override
    public List<CustomerVo> selectAllCustomer() {
        return null;
    }

    @Override
    @Transactional
    public void addCustomer(CustomerVo customerVo) {
        customerDao.insert(customerVo);
    }

    @Override
    @Transactional
    public int updateCustomer(CustomerVo customerVo) {
        return customerDao.update(customerVo);
    }

    @Override
    @Transactional
    public int delCustomer(CustomerVo customerVo) {
        return customerDao.deleteByCustomer(customerVo);
    }

}
