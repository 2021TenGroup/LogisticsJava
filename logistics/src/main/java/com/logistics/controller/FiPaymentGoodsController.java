package com.logistics.controller;

import com.logistics.entity.FiPaymentGoods;
import com.logistics.entity.result.Result;
import com.logistics.entity.result.ResultCode;
import com.logistics.service.FiPaymentGoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

/**
 * (FiPaymentGoods)表控制层
 *
 * @author makejava
 * @since 2021-07-11 16:42:59
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
    @GetMapping("/selectOne/{id}")
    public Result selectOne(@PathVariable("id") Integer id) {
        System.out.println("selectOne:"+id);
        return new Result(ResultCode.SUCCESS,this.fiPaymentGoodsService.queryById(id));
    }

    @GetMapping("/selectAll")
    public Result selectAll(@RequestBody FiPaymentGoods fiPaymentGoods) {
        return new Result(ResultCode.SUCCESS,this.fiPaymentGoodsService.queryAll(fiPaymentGoods));
    }

}
