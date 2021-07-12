package com.logistics.controller;

import com.logistics.entity.FiAdvancCharge;
import com.logistics.service.FiAdvancChargeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 预付款表(FiAdvancCharge)表控制层
 *
 * @author makejava
 * @since 2021-07-12 17:45:06
 */
@RestController
@RequestMapping("fiAdvancCharge")
public class FiAdvancChargeController {
    /**
     * 服务对象
     */
    @Resource
    private FiAdvancChargeService fiAdvancChargeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FiAdvancCharge selectOne(Integer id) {
        return this.fiAdvancChargeService.queryById(id);
    }

}
