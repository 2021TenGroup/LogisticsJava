package com.logistics.dao;

import com.logistics.entity.FiAdvancCharge;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface FiAdvancChargeDao {
    int deleteByPrimaryKey(Integer acId);

    int insert(FiAdvancCharge record);

    int insertSelective(FiAdvancCharge record);

    FiAdvancCharge selectByPrimaryKey(Integer acId);

    int updateByPrimaryKeySelective(FiAdvancCharge record);

    int updateByPrimaryKey(FiAdvancCharge record);

    /**
     * 查询所有预付款
     */
    List<FiAdvancCharge> findAllAdvance();

    /**
     * 开账
     */
    int updateAdvance(FiAdvancCharge fiAdvancCharge);

    /**
     * 修改账户金额
     */
    void updateReMoney(@Param("outletsId") int outletsId,@Param("acBalance") BigDecimal acBalance);
}
