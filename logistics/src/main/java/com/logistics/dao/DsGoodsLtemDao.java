package com.logistics.dao;

import com.logistics.entity.DsGoodsLtem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DsGoodsLtemDao {
    //添加订单的物品类型信息
    int addOrdersDsGoods(DsGoodsLtem record);

}