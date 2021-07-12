package com.logistics.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.entity.FiCashBill;
import com.logistics.entity.FiMoneyDetailed;
import com.logistics.service.FiMoneyDetailedService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FiMoneyDetailed)表控制层
 *
 * @author makejava
 * @since 2021-07-12 11:46:56
 */
@RestController
@RequestMapping("/fiMoneyDetailed")
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
    @GetMapping("/selectOne")
    public FiMoneyDetailed selectOne(Integer id) {
        return this.fiMoneyDetailedService.queryById(id);
    }

    @GetMapping("/selectAll")
    public PageInfo<FiMoneyDetailed> queryAll(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<FiMoneyDetailed> list = fiMoneyDetailedService.queryAll();
        PageInfo<FiMoneyDetailed> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}
