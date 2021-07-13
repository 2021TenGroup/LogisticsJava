package com.logistics.dao;

import com.logistics.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsDao {
    //添加订单的物品信息
    int addOrdersGoods(Goods goods);

    int deleteByGoods(Goods goods);
}