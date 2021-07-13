package com.logistics.controller;

import com.logistics.entity.PerPosition;
import com.logistics.service.PerPositionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (PerPosition)表控制层
 *
 * @author makejava
 * @since 2021-07-11 17:00:02
 */
@RestController
@Slf4j
public class PerPositionController {
    /**
     * 服务对象
     */
    @Resource
    private PerPositionService perPositionService;

}
