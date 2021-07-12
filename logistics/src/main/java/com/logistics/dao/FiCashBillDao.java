package com.logistics.dao;

import com.logistics.entity.FiCashBill;

public interface FiCashBillDao {
    int deleteByPrimaryKey(Integer cbId);

    int insert(FiCashBill record);

    int insertSelective(FiCashBill record);

    FiCashBill selectByPrimaryKey(Integer cbId);

    int updateByPrimaryKeySelective(FiCashBill record);

    int updateByPrimaryKey(FiCashBill record);
}