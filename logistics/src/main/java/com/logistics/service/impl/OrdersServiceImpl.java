package com.logistics.service.impl;

import com.logistics.dao.DsGoodsLtemDao;
import com.logistics.dao.GoodsDao;
import com.logistics.entity.DsGoodsLtem;
import com.logistics.entity.Goods;
import com.logistics.entity.Orders;
import com.logistics.dao.OrdersDao;
import com.logistics.entity.OrdersAll;
import com.logistics.service.OrdersService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Orders)表服务实现类
 *
 * @author makejava
 * @since 2021-07-13 04:36:31
 */
@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
    @Resource
    private OrdersDao ordersDao;

    @Autowired
    private GoodsDao goodsDao;

    @Autowired
    private DsGoodsLtemDao goodsLtemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param oId 主键
     * @return 实例对象
     */
    @Override
    public Orders queryById(Integer oId) {
        return this.ordersDao.queryById(oId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Orders> queryAllByLimit(int offset, int limit) {
        return this.ordersDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orders 实例对象
     * @return 实例对象
     */
    @Override
    public Orders insert(Orders orders) {
        this.ordersDao.insert(orders);
        return orders;
    }

    /**
     * 修改数据
     *
     * @param orders 实例对象
     * @return 实例对象
     */
    @Override
    public Orders update(Orders orders) {
        this.ordersDao.update(orders);
        return this.queryById(orders.getOId());
    }

    /**
     * 通过主键删除数据
     *
     * @param oId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer oId) {
        return this.ordersDao.deleteById(oId) > 0;
    }

    //插入一条订单
    @Transactional
    public int addOrders(OrdersAll ordersAll)  {
        Orders orders = new Orders();
        BeanUtils.copyProperties(ordersAll,orders);

//        Goods goods=new Goods();
//        DsGoodsLtem goodsLtem=new DsGoodsLtem();
//        orders.setGoodId(goods.getGoodId());
//        orders.setAddname(goods.getAddname());
//        orders.setDsGoodsId(goodsLtem.getDsGoodsId());

//        int x=goodsDao.addOrdersGoods(goods);
//        int y=goodsLtemDao.addOrdersDsGoods(goodsLtem);
//        int i=ordersDao.addOrders(orders);
        return  ordersDao.addOrders(orders) ;
    }
    //查询所有的未录入的订单信息
    @Override
    public List<Orders> selAllOrders(){
        return ordersDao.selAllOrders();
    }
    //查询所有未录入和已录入的订单信息
    @Override
    public List<Orders> selAllOrdersAndwaybill(){
        return ordersDao.selAllOrdersAndwaybill();
    }


    //删除订单
    @Override
    public int deleteByOrders(Orders orders) {
        return ordersDao.deleteByOrders(orders);
    }

    //修改添加录入
    @Override
    public int updOrdersW (OrdersAll ordersAll) {
        Orders orders = new Orders();
        BeanUtils.copyProperties(ordersAll,orders);
        return ordersDao.updOrdersW(orders);
    }
}
