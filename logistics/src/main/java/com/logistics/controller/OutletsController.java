package com.logistics.controller;

import com.logistics.entity.Outlets;
import com.logistics.service.OutletsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Outlets)表控制层
 *
 * @author makejava
 * @since 2021-07-13 04:36:31
 */
@RestController
@RequestMapping("outlets")
public class OutletsController {
    /**
     * 服务对象
     */
    @Resource
    private OutletsService outletsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Outlets selectOne(Integer id) {
        return this.outletsService.queryById(id);
    }

}
