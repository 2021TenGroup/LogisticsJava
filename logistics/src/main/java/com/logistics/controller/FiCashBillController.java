package com.logistics.controller;

import com.logistics.entity.FiCashBill;
import com.logistics.entity.result.Result;
import com.logistics.entity.result.ResultCode;
import com.logistics.service.FiCashBillService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
    public Result selectAll(@RequestBody FiCashBill fiCashBill){
        return new Result(ResultCode.SUCCESS, fiCashBillService.queryAll(fiCashBill));
    }

}
