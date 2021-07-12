package com.logistics.controller;

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
    public List<FiAdvancCharge> findAllAdvance() {
        List<FiAdvancCharge> all = fiAdvancChargeService.findAllAdvance();
        return all;
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
    public List<FiRecharge> findAllRecharge() {
        List<FiRecharge> all = fiAdvancChargeService.findAllRecharge();
        return all;
    }
}
