package com.logistics.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.entity.DsWaybillEntrt;
import com.logistics.entity.FiCashBill;
import com.logistics.entity.FiPaymentGoods;
import com.logistics.entity.result.Result;
import com.logistics.entity.result.ResultCode;
import com.logistics.service.FiCashBillService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FiCashBill)表控制层
 *
 * @author makejava
 * @since 2021-07-12 02:51:53
 */
@RestController
@RequestMapping("/fiCashBill")
public class FiCashBillController {
    /**
     * 服务对象
     */
    @Resource
    private FiCashBillService fiCashBillService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/select/{id}")
    public Result selectOne(@PathVariable("id") Integer id) {
        return new Result(ResultCode.SUCCESS,this.fiCashBillService.queryById(id));
    }

    /**
     * 查询全部
     */
    @GetMapping("/selectAll")
    public PageInfo<FiCashBill> selectAll(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<FiCashBill> list = fiCashBillService.queryAll(null);
        PageInfo<FiCashBill> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 添加数据
     */
    @PostMapping("/addFiCashBill/{oId}")
    public int addFiCashBill(@PathVariable("oId") Integer oId ,@RequestBody DsWaybillEntrt dsWaybillEntrt){
        System.out.println("dsWaybillEntrt.getOId():"+oId);
        System.out.println("dsWaybillEntrt.getWaybillNumber():"+dsWaybillEntrt.getWaybillNumber());
        dsWaybillEntrt.setOId(oId);
        return fiCashBillService.addFiCashBill(dsWaybillEntrt);
    }

    /**
     * 运单签收
     */
    @PutMapping("/updateCashBillState")
    public int updateCashBillState(@RequestBody DsWaybillEntrt dsWaybillEntrtEntity){
        System.out.println(dsWaybillEntrtEntity.toString());
        return fiCashBillService.updateCashBillState(dsWaybillEntrtEntity);
    }

}
