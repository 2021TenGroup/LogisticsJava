package com.logistics.service.impl;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.logistics.dao.FiCashBillDao;
import com.logistics.entity.DsWaybillEntrt;
import com.logistics.entity.FiCashBill;
import com.logistics.entity.Orders;
import com.logistics.service.FiCashBillService;
import com.logistics.service.OrdersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (FiCashBill)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 02:51:53
 */
@Transactional
@Service("fiCashBillService")
@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
public class FiCashBillServiceImpl implements FiCashBillService {
    @Resource
    private FiCashBillDao fiCashBillDao;
    @Resource
    private OrdersService ordersService;

    /**
     * 通过ID查询单条数据
     *
     * @param cbId 主键
     * @return 实例对象
     */

    @Override
    public FiCashBill queryById(Integer cbId) {
        return this.fiCashBillDao.queryById(cbId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FiCashBill> queryAllByLimit(int offset, int limit) {
        return this.fiCashBillDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param fiCashBill 实例对象
     * @return 实例对象
     */
    @Transactional
    @Override
    public FiCashBill insert(FiCashBill fiCashBill) {
        this.fiCashBillDao.insert(fiCashBill);
        return fiCashBill;
    }

    /**
     * 修改数据
     *
     * @param fiCashBill 实例对象
     * @return 实例对象
     */
    @Transactional
    @Override
    public FiCashBill update(FiCashBill fiCashBill) {
        this.fiCashBillDao.update(fiCashBill);
        return this.queryById(fiCashBill.getCbId());
    }

    /**
     * 通过主键删除数据
     *
     * @param cbId 主键
     * @return 是否成功
     */
    @Transactional
    @Override
    public boolean deleteById(Integer cbId) {
        return this.fiCashBillDao.deleteById(cbId) > 0;
    }

    /**
     * 查询全部
     */
    public List<FiCashBill> queryAll(FiCashBill fiCashBill){
        return fiCashBillDao.queryAll(fiCashBill);
    }

    /**
     * 运单录入时，添加运费帐单表
     */
    @Transactional
    @Override
    public int addFiCashBill(DsWaybillEntrt dsWaybillEntrtEntity){      //运单表Entity
        Integer oid = dsWaybillEntrtEntity.getOId();      //获取订单ID
        Orders orders = ordersService.queryById(oid);      //查询出订单实体类
        FiCashBill fiCashBill = new FiCashBill();

        fiCashBill.setWaybillNumber(dsWaybillEntrtEntity.getWaybillNumber());   //插入运单编号

        Double money = orders.getFreight();  // 获取订单表 运费金额
        fiCashBill.setCbMoney(money);

        Integer state = orders.getPaymentMethod(); //收取状态
        if (state == 0) {        //寄付
            fiCashBill.setCbState(0);     //收取状态：已收取
            fiCashBill.setCbDeliverType(0);       //类型：寄付
            fiCashBill.setAddtime(new Date());
        }else {     //到付
            fiCashBill.setCbState(1);     //收取状态：未收取
            fiCashBill.setCbDeliverType(1);       //类型：到付
        }

        fiCashBill.setCbFreightType(0);
        System.out.println(fiCashBill.toString());

       return fiCashBillDao.insert(fiCashBill);
    }

    /**
     * 当签收之后，改变收取状态
     * @param dsWaybillEntrtEntity
     * @return
     */
    @Transactional
    @Override
    public int updateCashBillState(DsWaybillEntrt dsWaybillEntrtEntity){
        String waybillNumber = dsWaybillEntrtEntity.getWaybillNumber();    //获取 运单录入表 运单编号
        FiCashBill fiCashBill = fiCashBillDao.queryByWaybillNumber(waybillNumber);
        fiCashBill.setCbState(1);
        if(fiCashBill.getCbDeliverType() == 1){
            fiCashBill.setAddtime(new Date());  //如果该订单是到付的话，则添加收取时间
        }
        fiCashBill.setCbState(0);
        return fiCashBillDao.update(fiCashBill);
    }

}
