package com.logistics.controller;

import com.logistics.entity.Commission;
import com.logistics.service.CommissionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Commission)表控制层
 *
 * @author makejava
 * @since 2021-07-13 11:15:20
 */
@RestController
@RequestMapping("commission")
public class CommissionController {
    /**
     * 服务对象
     */
    @Resource
    private CommissionService commissionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Commission selectOne(Integer id) {
        return this.commissionService.queryById(id);
    }

}
