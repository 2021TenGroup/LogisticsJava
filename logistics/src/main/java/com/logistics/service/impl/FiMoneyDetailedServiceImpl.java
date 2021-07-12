package com.logistics.service.impl;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.logistics.dao.FiMoneyDetailedDao;
import com.logistics.entity.FiAdvancCharge;
import com.logistics.entity.FiMoneyDetailed;
import com.logistics.service.FiAdvancChargeService;
import com.logistics.service.FiMoneyDetailedService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (FiMoneyDetailed)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 11:46:56
 */
@Transactional
@Service("fiMoneyDetailedService")
@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
public class FiMoneyDetailedServiceImpl implements FiMoneyDetailedService {
    @Resource
    private FiMoneyDetailedDao fiMoneyDetailedDao;
    @Resource
    private FiAdvancChargeService fiAdvancChargeService;

    /**
     * 通过ID查询单条数据
     *
     * @param mdId 主键
     * @return 实例对象
     */
    @Override
    public FiMoneyDetailed queryById(Integer mdId) {
        return this.fiMoneyDetailedDao.queryById(mdId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FiMoneyDetailed> queryAllByLimit(int offset, int limit) {
        return this.fiMoneyDetailedDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param fiMoneyDetailed 实例对象
     * @return 实例对象
     */
    @Override
    public FiMoneyDetailed insert(FiMoneyDetailed fiMoneyDetailed) {
        this.fiMoneyDetailedDao.insert(fiMoneyDetailed);
        return fiMoneyDetailed;
    }

    /**
     * 修改数据
     *
     * @param fiMoneyDetailed 实例对象
     * @return 实例对象
     */
    @Override
    public FiMoneyDetailed update(FiMoneyDetailed fiMoneyDetailed) {
        this.fiMoneyDetailedDao.update(fiMoneyDetailed);
        return this.queryById(fiMoneyDetailed.getMdId());
    }

    /**
     * 通过主键删除数据
     *
     * @param mdId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer mdId) {
        return this.fiMoneyDetailedDao.deleteById(mdId) > 0;
    }

    /**
     * 查询全部
     * @return
     */
    @Override
    public List<FiMoneyDetailed> queryAll(){
        return fiMoneyDetailedDao.queryAll(null);
    }

    /**
     * 当运单进行录入、入库、出库、签收操作时，新增记录
     *
     * 运单表Entity , 网点名称 , 操作人员名称 , 类型（0：录入 1：入库）
     */
/*
    @Override
    public int addFiMD(DsWaybillEntrt dsWaybillEntrtEntity , String outletsName , String userName , int type){

        FiMoneyDetailed fiMoneyDetailed = new FiMoneyDetailed();

        String waybillNumber = dsWaybillEntrtEntity.getWaybillNumber(); //获取运单编号
        fiMoneyDetailed.setWaybillNumber(waybillNumber);     //插入运单编号

        fiMoneyDetailed.setOutletsName(outletsName);        //插入网点名称

        fiMoneyDetailed.setUserName(userName);      //插入操作人员

        Outlets outlets = OutletsService.queryByOutletsName(outletsName);       //根据网点名称 获取网点信息
        Integer outletsId = outlets.getOuletsId();
        double money = 0;
        //（0：录入 1：入库）
        if(type == 0){
            Type type_ = TypeService.queryByTypeName("入库");
            money -= type.getMoney();    //获取其收取的金额
            fiMoneyDetailed.setMdType(0);       //插入类型
            fiMoneyDetailed.setMdDetails("收取维护费");
        }else if(type == 1){
            Commission commission = CommissionSerivce.queryByOutletsId(outletsId);   //根据网点ID 获取提成表信息
            double ratio = commission.getCommissionRatio();        //提成比例
            ratio /= 100;
            money *= ratio;
            fiMoneyDetailed.setMdType(1);       //插入类型
            fiMoneyDetailed.setMdDetails("收取提成费");
        }
        fiMoneyDetailed.setMdCollectMoney(money);   //插入维护金额

        FiAdvancCharge fiAdvancCharge = fiAdvancChargeService.queryByOutletsId(outletsId);       //根据网点ID 获取预付款表信息
        double oldMoney = fiAdvancCharge.getAcBalance();
        double newMoney = oldMoney-money;
        fiAdvancChargeService.updateAcBalance(fiAdvancCharge.getOutletsId() , newMoney);    //修改预付款表中的余额

        fiMoneyDetailed.setMdBalance(newMoney);     //插入余额

        fiMoneyDetailed.setAddtime(new Date());//插入时间

        return fiMoneyDetailedDao.insert(fiMoneyDetailed);

    }
*/


}
