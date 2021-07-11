package com.logistics.service.impl;

import com.logistics.dao.FiPaymentGoodsDao;
import com.logistics.entity.FiPaymentGoods;
import com.logistics.service.FiPaymentGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FiPaymentGoods)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 16:42:59
 */
@Service("fiPaymentGoodsService")
public class FiPaymentGoodsServiceImpl implements FiPaymentGoodsService {
    @Resource
    private FiPaymentGoodsDao fiPaymentGoodsDao;

    @Override
    public List<FiPaymentGoods> queryAll(FiPaymentGoods fiPaymentGoods){
        return fiPaymentGoodsDao.queryAll(fiPaymentGoods);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param pgId 主键
     * @return 实例对象
     */
    @Override
    public FiPaymentGoods queryById(Integer pgId) {
        return this.fiPaymentGoodsDao.queryById(pgId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FiPaymentGoods> queryAllByLimit(int offset, int limit) {
        return this.fiPaymentGoodsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param fiPaymentGoods 实例对象
     * @return 实例对象
     */
//    @Override
//    public FiPaymentGoods insert(DsWaybillEntrtEntity dsWaybillEntrtEntity) {
//        FiPaymentGoods fiPaymentGoods = new FiPaymentGoods();
//        String waybillId = DsWaybillEntrtEntity.getWaybillNumber();    //获取 运单录入表 运单ID
//        fiPaymentGoods.setWaybillId(waybillId);
//
//        Double paymentGoods = dsWaybillEntrtEntity.getPaymentGoods();     //获取 运单录入表 代收货款
//        fiPaymentGoods.setPgPayment(paymentGoods);
//
//        Double serviceMoney = paymentGoods*0.03;    //服务费： 总金额*0.03
//        fiPaymentGoods.setPgServiceMoney(serviceMoney);
//
//        fiPaymentGoods.setPgActualMoney(paymentGoods-serviceMoney);//实发给客户的金额
//
//        fiPaymentGoods.setOutletsId1(dsWaybillEntrtEntity.getMailingOutlets());//首网点
//
//        fiPaymentGoods.setOutletsId2(dsWaybillEntrtEntity.getObjective());//末网点
//
//        Integer oId = dsWaybillEntrtEntity.getOId(); //根据运单编号 获取订单编号
//
//        OrderEntity orderEntity = OrderService.queryById(oId);//根据oId查询订单表数据
//
//        Integer customerId = orderEntity.getCustomerId();   //获取寄件客户ID
//
//        CustomerEntity customerEntity = CustomerService.queryById(customerId);  //根据客户ID查询客户信息
//
//        fiPaymentGoods.setSender(customerEntity.getCustomerName());   //获取寄件人姓名
//
//        fiPaymentGoods.setSenderPhone(customerEntity.getCustomerPhone());   //获取寄件人电话号码
//
//        this.fiPaymentGoodsDao.insert(fiPaymentGoods);
//        return fiPaymentGoods;
//    }

    /**
     * 修改数据
     *
     * @param fiPaymentGoods 实例对象
     * @return 实例对象
     */
    @Override
    public FiPaymentGoods update(FiPaymentGoods fiPaymentGoods) {
        this.fiPaymentGoodsDao.update(fiPaymentGoods);
        return this.queryById(fiPaymentGoods.getPgId());
    }

    /**
     * 通过主键删除数据
     *
     * @param pgId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pgId) {
        return this.fiPaymentGoodsDao.deleteById(pgId) > 0;
    }

    /**
     * 运单签收之后，添加员工
     * @param dsSignEntity      运单录入Entity
     * @return
     */
/*    @Override
    public int updateEmpId(DsSignEntity dsSignEntity) {
        Integer waybillId = dsSignEntity.getWaybillId();    //获取 运单签收表 运单ID
        FiPaymentGoods fiPaymentGoods = fiPaymentGoodsDao.queryByWaybillId(waybillId);      //根据运单ID查询代收货款表
        if(fiPaymentGoods != null){
            Integer empID = dsSignEntity.getEmpId();    //获取 运单签收表 员工ID
            fiPaymentGoods.setEmpId(empID);
            return fiPaymentGoodsDao.update(fiPaymentGoods);
        }
        return 0;
    }*/


}
