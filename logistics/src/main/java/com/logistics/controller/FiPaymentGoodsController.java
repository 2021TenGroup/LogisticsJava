package com.logistics.controller;

import com.logistics.entity.FiPaymentGoods;
import com.logistics.service.FiPaymentGoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (FiPaymentGoods)表控制层
 *
 * @author makejava
 * @since 2021-07-12 01:21:45
 */
@RestController
@RequestMapping("fiPaymentGoods")
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
    @GetMapping("selectOne")
    public FiPaymentGoods selectOne(Integer id) {
        return this.fiPaymentGoodsService.queryById(id);
    }

}
