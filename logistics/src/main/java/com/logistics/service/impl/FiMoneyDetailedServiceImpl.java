package com.logistics.service.impl;

import com.logistics.dao.FiMoneyDetailedDao;
import com.logistics.entity.FiMoneyDetailed;
import com.logistics.service.FiMoneyDetailedService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FiMoneyDetailed)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 11:46:56
 */
@Service("fiMoneyDetailedService")
public class FiMoneyDetailedServiceImpl implements FiMoneyDetailedService {
    @Resource
    private FiMoneyDetailedDao fiMoneyDetailedDao;

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
     * 当运单进行录入、入库、出库、签收操作时，新增记录
     *
     * 运单表Entity , 网点名称 , 类型（0：录入 1：入库）
     */
//    @Override
//    public FiMoneyDetailed addFiMD(DsWaybillEntrt dsWaybillEntrtEntity , String outletsName , String userName , int type){
//
//        FiMoneyDetailed fiMoneyDetailed = new FiMoneyDetailed();
//
//        String waybillNumber = dsWaybillEntrtEntity.getWaybillNumber(); //获取运单编号
//        fiMoneyDetailed.setWaybillNumber(waybillNumber);
//
//        fiMoneyDetailed.setOutletsName(outletsName);        //网点名称
//
//        fiMoneyDetailed.setUserName(userName);      //操作人员
//
//        double money = 0;
//        //（0：录入 1：入库）
//        if(type == 0){
//            Type type_ = TypeService.queryByTypeName("录入");
//            money -= type.getMoney();    //获取其收取的金额
//        }else if(type == 1){
//            Outlets outlets = OutletsService.queryByOutletsName(outletsName);       //根据员工名称 获取员工表
//            Commission commission = CommissionSerivce.queryById(outlets.getOuletsId);   //根据员工名称 获取
//            double ratio = commission.getCommissionRatio();        //提成比例
//
//        }
//    }


}
