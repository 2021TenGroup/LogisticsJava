package com.logistics.dao;

import com.logistics.entity.FiRecharge;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FiRechargeDao {
    int deleteByPrimaryKey(Integer reId);

    int insert(FiRecharge record);

    int insertSelective(FiRecharge record);

    FiRecharge selectByPrimaryKey(Integer reId);

    int updateByPrimaryKeySelective(FiRecharge record);

    int updateByPrimaryKey(FiRecharge record);

    /**
     * 充值
     */
    int addAdvance(FiRecharge fiRecharge);

    /**
     * 充值记录
     */
    List<FiRecharge> findAllRecharge();
}
