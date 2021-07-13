package com.logistics.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.entity.FiAdvancCharge;
import com.logistics.entity.FiRecharge;
import com.logistics.service.FiAdvancChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;

@RestController
public class FiAdvancChargeController {

    @Autowired
    FiAdvancChargeService fiAdvancChargeService;

    /**
     * 查询所有预付款
     */
    @GetMapping("/findAllAdvance")
    public PageInfo<FiAdvancCharge> findAllAdvance(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<FiAdvancCharge> all = fiAdvancChargeService.findAllAdvance();
        PageInfo<FiAdvancCharge> pageInfo = new PageInfo<>(all);
        return pageInfo;
    }

    /**
     * 开账
     */
    @PutMapping("/updateAdvance")
    public void updateAdvance(@RequestBody FiAdvancCharge fiAdvancCharge){
        fiAdvancCharge.setUpdatetime(new Date());
        fiAdvancChargeService.updateAdvance(fiAdvancCharge);
    }

    /**
     * 充值
     */
    @PostMapping("/addAdvance")
    public void addAdvance(@RequestBody FiRecharge fiRecharge){
        Date date = new Date();
        fiRecharge.setAddtime(date);
        fiAdvancChargeService.addAdvance(fiRecharge);
    }

    /**
     * 充值记录
     */
    @GetMapping("/findAllRecharge")
    public PageInfo<FiRecharge> findAllRecharge(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<FiRecharge> all = fiAdvancChargeService.findAllRecharge();
        PageInfo<FiRecharge> pageInfo = new PageInfo<>(all);
        return pageInfo;
    }
}
