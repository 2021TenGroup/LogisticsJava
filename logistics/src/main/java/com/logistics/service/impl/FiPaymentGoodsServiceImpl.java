package com.logistics.service.impl;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.logistics.dao.EmpDao;
import com.logistics.dao.FiPaymentGoodsDao;
import com.logistics.dao.OrdersDao;
import com.logistics.dao.OutletsDao;
import com.logistics.entity.*;
import com.logistics.service.DsWaybillEntrtService;
import com.logistics.service.FiAdvancChargeService;
import com.logistics.service.FiPaymentGoodsService;
import com.logistics.service.OrdersService;
import com.logistics.vo.EmpVo;
import com.logistics.vo.OutletsVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (FiPaymentGoods)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 02:32:09
 */
@Transactional
@Service("fiPaymentGoodsService")
@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
public class FiPaymentGoodsServiceImpl implements FiPaymentGoodsService {
    @Resource
    private FiPaymentGoodsDao fiPaymentGoodsDao;
    @Resource
    private OrdersDao ordersDao;
    @Resource
    private OutletsDao outletsDao;
    @Resource
    private EmpDao empDao;
    @Resource
    private DsWaybillEntrtService dsWaybillEntrtService;
    @Resource
    private FiAdvancChargeService fiAdvancChargeService;

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
    @Override
    public FiPaymentGoods addFiPG(DsWaybillEntrt dsWaybillEntrtEntity) {      //运单录入实体类

        FiPaymentGoods fiPaymentGoods = new FiPaymentGoods();
        String waybillNumber = dsWaybillEntrtEntity.getWaybillNumber();    //获取 运单录入表 运单编号
        fiPaymentGoods.setWaybillNumber(waybillNumber);


        Integer oId = dsWaybillEntrtEntity.getOId();    //根据运单 获取订单编号
        Orders orders = ordersDao.queryById(oId);

        System.out.println("oId:"+oId);
        System.out.println("orders.getPaymentForGoods():"+orders.getPaymentForGoods());
        if (orders.getPaymentForGoods() == null || orders.getPaymentForGoods() == 0){
            System.out.println("没有代收货款，添加失败");
            return null;
        }
        Double paymentGoods = orders.getPaymentForGoods();     //获取 订单表 代收货款
        fiPaymentGoods.setPgPayment(paymentGoods);

        Double serviceMoney = paymentGoods*0.03;    //服务费： 总金额*0.03
        fiPaymentGoods.setPgServiceMoney(serviceMoney);

        fiPaymentGoods.setPgActualMoney(paymentGoods-serviceMoney);   //实发给客户的金额

        System.out.println("orders.getEmpId():"+orders.getEmpId());
        EmpVo empVo = empDao.queryById(orders.getEmpId());       //首网点
        OutletsVo outletsVo = outletsDao.queryById(empVo.getOutletsId());
        fiPaymentGoods.setOutletsId1(outletsVo.getOutletsName());

        outletsVo = outletsDao.queryById(orders.getOutletsId());  //末网点
        fiPaymentGoods.setOutletsId2(outletsVo.getOutletsName());

        fiPaymentGoods.setPgSender(orders.getSender());   //获取寄件人姓名

        fiPaymentGoods.setPgSenderPhone(orders.getSenderPhone());   //获取寄件人电话号码

        this.fiPaymentGoodsDao.insert(fiPaymentGoods);
        return fiPaymentGoods;
    }

    /**
     * 运单签收之后，添加员工,有员工则已签收
     * @param dsSign      运单录入Entity
     * @return
     */
    @Override
    public int updateUserName(DsSign dsSign) {
        Integer waybillId = dsSign.getWaybillId();    //获取 运单签收表 运单ID
        DsWaybillEntrt dsWaybillEntrt = dsWaybillEntrtService.queryById(waybillId);
        FiPaymentGoods fiPaymentGoods = fiPaymentGoodsDao.queryByWaybillNumber(dsWaybillEntrt.getWaybillNumber());      //根据运单ID查询代收货款表
        if(fiPaymentGoods != null){
            Integer empID = dsSign.getEmpId();    //获取 运单签收表 员工ID
            EmpVo empVo = empDao.queryById(empID);
            fiPaymentGoods.setUserName(empVo.getUserName());
            fiPaymentGoods.setAddtime(new Date());

            Orders orders = ordersDao.queryById(dsWaybillEntrt.getOId());

            FiAdvancCharge fiAdvancCharge = fiAdvancChargeService.queryByOutletsId(1);       //根据网点ID 获取预付款表信息
            double oldMoney = fiAdvancCharge.getAcBalance();
            double money = orders.getPaymentForGoods();        //代收款
            double newMoney = oldMoney + money;
            fiAdvancCharge.setAcBalance(newMoney);
            System.out.println("===========fiAdvancCharge:"+fiAdvancCharge);
            fiAdvancChargeService.updateAdvance(fiAdvancCharge);    //修改预付款表中的余额



            return fiPaymentGoodsDao.update(fiPaymentGoods);

        }

        return 0;

    }

    /**
     * 点击发放
     * 改变时效性，1则不可以再发放
     */
    @Override
    public int updateTimeLiness(FiPaymentGoods fiPaymentGoods){

        String waybillNumber = fiPaymentGoods.getWaybillNumber();
        FiPaymentGoods fiPaymentGoods1 = fiPaymentGoodsDao.queryByWaybillNumber(waybillNumber);

        FiAdvancCharge fiAdvancCharge = fiAdvancChargeService.queryByOutletsId(1);       //根据网点ID 获取预付款表信息
        double oldmoney = fiAdvancCharge.getAcBalance();
        double money = fiPaymentGoods1.getPgActualMoney();       //应发金额
        double newmoney = oldmoney - money;
        fiAdvancCharge.setAcBalance(newmoney);
        fiAdvancChargeService.updateAdvance(fiAdvancCharge);    //修改预付款表中的余额
        return fiPaymentGoodsDao.updateTimeliness(waybillNumber);
    }

}
