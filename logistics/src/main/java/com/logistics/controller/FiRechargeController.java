package com.logistics.controller;

import com.logistics.entity.FiRecharge;
import com.logistics.service.FiRechargeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (FiRecharge)表控制层
 *
 * @author makejava
 * @since 2021-07-11 16:43:00
 */
@RestController
@RequestMapping("fiRecharge")
public class FiRechargeController {
    /**
     * 服务对象
     */
    @Resource
    private FiRechargeService fiRechargeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FiRecharge selectOne(Integer id) {
        return this.fiRechargeService.queryById(id);
    }

}
