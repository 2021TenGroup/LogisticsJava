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
 * @since 2021-07-12 02:32:09
 */
@Service("fiPaymentGoodsService")
public class FiPaymentGoodsServiceImpl implements FiPaymentGoodsService {
    @Resource
    private FiPaymentGoodsDao fiPaymentGoodsDao;

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
     * 查询全部
     */
    @Override
    public List<FiPaymentGoods> queryAll(FiPaymentGoods fiPaymentGoods){
        return fiPaymentGoodsDao.queryAll(fiPaymentGoods);
    }

    /**
     * 新增数据
     * 当运单录入时，有代收货款，则新增代收货款记录
     * @param dsWaybillEntrtEntity 实例对象
     * @return 实例对象
     */
//    @Override
//    public FiPaymentGoods insert(DsWaybillEntrt dsWaybillEntrtEntity) {      //运单录入实体类
//
//        FiPaymentGoods fiPaymentGoods = new FiPaymentGoods();
//        String waybillId = dsWaybillEntrtEntity.getWaybillNumber();    //获取 运单录入表 运单编号
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
//        fiPaymentGoods.setOutletsId1(dsWaybillEntrtEntity.getOutletsId());     //首网点
//
//        fiPaymentGoods.setOutletsId2(dsWaybillEntrtEntity.getOutletsId1());      //末网点
//
//        Integer oId = dsWaybillEntrtEntity.getOId(); //根据运单 获取订单编号
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
     * 运单签收之后，添加员工,有员工则已签收
     * @param dsWaybillEntrtEntity      运单录入Entity
     * @return
     */
//    @Override
//    public int updateEmpId(DsWaybillEntrt dsWaybillEntrtEntity) {
//        Integer waybillId = dsSignEntity.getWaybillId();    //获取 运单签收表 运单ID
//        FiPaymentGoods fiPaymentGoods = fiPaymentGoodsDao.queryByWaybillId(waybillId);      //根据运单ID查询代收货款表
//        if(fiPaymentGoods != null){
//            Integer oId = dsWaybillEntrtEntity.getOId();//获取 运单签收表 订单ID
//            Oreders oreders = dsWaybillService.queryByOId(oId);
//            Integer empID = oreders.getEmpId();    //获取 运单签收表 员工ID
//            fiPaymentGoods.setEmpId(empID);
//            return fiPaymentGoodsDao.update(fiPaymentGoods);
//        }
//        return 0;
//    }

    /**
     * 点击发放
     * 改变时效性，1则不可以再发放
     */
    @Override
    public int updateTimeLiness(FiPaymentGoods fiPaymentGoods){
        return fiPaymentGoodsDao.updateTimeliness(fiPaymentGoods.getPgId());
    }

}
