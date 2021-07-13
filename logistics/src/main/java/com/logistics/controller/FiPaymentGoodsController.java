package com.logistics.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.entity.DsSign;
import com.logistics.entity.DsWaybillEntrt;
import com.logistics.entity.FiPaymentGoods;
import com.logistics.entity.result.Result;
import com.logistics.entity.result.ResultCode;
import com.logistics.service.FiPaymentGoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FiPaymentGoods)表控制层
 *
 * @author makejava
 * @since 2021-07-12 02:32:10
 */
@RestController
@RequestMapping("/fiPaymentGoods")
public class FiPaymentGoodsController {
    /**
     * 服务对象
     */
    @Resource
    private FiPaymentGoodsService fiPaymentGoodsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/select/{id}")
    public Result selectOne(@PathVariable("id") Integer id) {
        return new Result(ResultCode.SUCCESS,this.fiPaymentGoodsService.queryById(id));
    }

    /**
     * 查询全部
     */
    @GetMapping("/selectAll")
    public PageInfo<FiPaymentGoods> selectAll(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<FiPaymentGoods> list = fiPaymentGoodsService.queryAll(null);
        PageInfo<FiPaymentGoods> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     *  新增数据
     *  当运单录入时，有代收货款，则新增代收货款记录
     */
    @PostMapping("/addFiPG/{oId}")
    public void addFiPG(@PathVariable("oId") Integer oid, @RequestBody DsWaybillEntrt dsWaybillEntrt){
        dsWaybillEntrt.setOId(oid);
        fiPaymentGoodsService.addFiPG(dsWaybillEntrt);
    }

    /**
     * 运单签收
     */
    @PutMapping("/updateUserName")
    public int updateUserName(@RequestBody DsSign dsSign){
        return fiPaymentGoodsService.updateUserName(dsSign);
    }

    /**
     * 点击发放
     * 改变时效性，1则不可以再发放
     */
    @PutMapping("/grant")
    public Result grant(@RequestBody FiPaymentGoods fiPaymentGoods){
        return new Result(ResultCode.SUCCESS,fiPaymentGoodsService.updateTimeLiness(fiPaymentGoods));
    }

}
