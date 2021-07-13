package com.logistics.controller;

import com.logistics.entity.DsSign;
import com.logistics.service.DsSignService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DsSign)表控制层
 *
 * @author makejava
 * @since 2021-07-13 09:04:53
 */
@RestController
@RequestMapping("dsSign")
public class DsSignController {
    /**
     * 服务对象
     */
    @Resource
    private DsSignService dsSignService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DsSign selectOne(Integer id) {
        return this.dsSignService.queryById(id);
    }

}
