package com.logistics.controller;

import com.logistics.entity.DsWaybillEntrt;
import com.logistics.service.DsWaybillEntrtService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DsWaybillEntrt)表控制层
 *
 * @author makejava
 * @since 2021-07-13 04:39:24
 */
@RestController
@RequestMapping("dsWaybillEntrt")
public class DsWaybillEntrtController {
    /**
     * 服务对象
     */
    @Resource
    private DsWaybillEntrtService dsWaybillEntrtService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DsWaybillEntrt selectOne(Integer id) {
        return this.dsWaybillEntrtService.queryById(id);
    }

}
