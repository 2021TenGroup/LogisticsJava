package com.logistics.controller;

import com.logistics.entity.Emp;
import com.logistics.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Emp)表控制层
 *
 * @author makejava
 * @since 2021-07-11 16:35:39
 */
@RestController
@Slf4j
public class EmpController {
    /**
     * 服务对象
     */
    @Resource
    private EmpService empService;



}
