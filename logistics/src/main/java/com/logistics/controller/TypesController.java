package com.logistics.controller;

import com.logistics.entity.Types;
import com.logistics.service.TypesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Types)表控制层
 *
 * @author makejava
 * @since 2021-07-13 11:07:55
 */
@RestController
@RequestMapping("types")
public class TypesController {
    /**
     * 服务对象
     */
    @Resource
    private TypesService typesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Types selectOne(Integer id) {
        return this.typesService.queryById(id);
    }

}
