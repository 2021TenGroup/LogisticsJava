package com.logistics.dao;

import com.logistics.entity.FiMoneyDetailed;

public interface FiMoneyDetailedDao {
    int deleteByPrimaryKey(Integer mdId);

    int insert(FiMoneyDetailed record);

    int insertSelective(FiMoneyDetailed record);

    FiMoneyDetailed selectByPrimaryKey(Integer mdId);

    int updateByPrimaryKeySelective(FiMoneyDetailed record);

    int updateByPrimaryKey(FiMoneyDetailed record);
}