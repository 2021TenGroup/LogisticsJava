package com.logistics.controller;

import com.logistics.entity.FiMoneyDetailed;
import com.logistics.service.FiMoneyDetailedService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (FiMoneyDetailed)表控制层
 *
 * @author makejava
 * @since 2021-07-12 11:46:56
 */
@RestController
@RequestMapping("fiMoneyDetailed")
public class FiMoneyDetailedController {
    /**
     * 服务对象
     */
    @Resource
    private FiMoneyDetailedService fiMoneyDetailedService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FiMoneyDetailed selectOne(Integer id) {
        return this.fiMoneyDetailedService.queryById(id);
    }

}
