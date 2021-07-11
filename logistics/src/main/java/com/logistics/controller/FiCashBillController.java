package com.logistics.controller;

import com.logistics.entity.FiCashBill;
import com.logistics.service.FiCashBillService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (FiCashBill)表控制层
 *
 * @author makejava
 * @since 2021-07-11 16:42:57
 */
@RestController
@RequestMapping("fiCashBill")
public class FiCashBillController {
    /**
     * 服务对象
     */
    @Resource
    private FiCashBillService fiCashBillService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FiCashBill selectOne(Integer id) {
        return this.fiCashBillService.queryById(id);
    }

}
