package com.logistics.dao;

import com.logistics.entity.FiPaymentGoods;

public interface FiPaymentGoodsDao {
    int deleteByPrimaryKey(Integer pgId);

    int insert(FiPaymentGoods record);

    int insertSelective(FiPaymentGoods record);

    FiPaymentGoods selectByPrimaryKey(Integer pgId);

    int updateByPrimaryKeySelective(FiPaymentGoods record);

    int updateByPrimaryKey(FiPaymentGoods record);
}