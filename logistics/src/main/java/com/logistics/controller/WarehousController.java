package com.logistics.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.entity.Warehous;
import com.logistics.entity.result.Result;
import com.logistics.entity.result.ResultCode;
import com.logistics.service.WarehousService;
import com.logistics.util.RandomNumber;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Warehous)表控制层
 *
 * @since 2021-07-11 17:11:15
 */
@RestController
@RequestMapping("/warehous")
public class WarehousController {
    /**
     * 服务对象
     */
    @Resource
    private WarehousService warehousService;


    /*
    入库
     */
    @PostMapping("/enterAdd")
    public ResultCode EnterTest(@RequestBody Warehous warehous) {
        System.out.println(warehous.getEnterPeople());
        RandomNumber randomNumber = new RandomNumber();
        //自动生成入库编码
        warehous.setEnterCode(randomNumber.getLocalTrmSeqNum());
        warehousService.insert(warehous);
        System.out.println(warehous.getEnterCode());
        return ResultCode.SUCCESS;
    }

    /*
    出库
     */
    @PutMapping("/outAdd")
    public ResultCode OutTest(@RequestBody Warehous warehous) {
//        System.out.println(warehous.toString());
        RandomNumber randomNumber = new RandomNumber();
        //自动生成出库编码
        warehous.setOutCode(randomNumber.getLocalTrmSeqNum());
        warehousService.update(warehous);
        return ResultCode.SUCCESS;
    }

    /*
        根据运单号查询入库信息
     */
    @GetMapping("/selectOne/{waybillId}")
    public Warehous selectOne(@PathVariable("waybillId") int waybillId) {
        //通过用户输入的运单号 查询运单id
//       int id = 运单service.selectidBy运单号;
        //再通过运单id查询该运单id的入库信息
        return this.warehousService.queryById(waybillId);
    }

//    查询所有
    @GetMapping("/seletAll")
    public List<Warehous> selectAll() {
        return warehousService.queryAll();
    }

//    @GetMapping("/seletAll")
//    public PageInfo<Warehous> selectAll(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pageSize) {
//        PageHelper.startPage(currentPage, pageSize);
//        List<Warehous> all = warehousService.queryAll();
//        PageInfo<Warehous> pageInfo = new PageInfo<>(all);
//        return pageInfo;
//    }

    //查询所有出库selectAllOut
//    @GetMapping("/seletAllOut")
//    public PageInfo<Warehous> selectAllOut(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pageSize) {
//        PageHelper.startPage(currentPage, pageSize);
//        List<Warehous> all = warehousService.queryAllOut();
//        PageInfo<Warehous> pageInfo = new PageInfo<>(all);
//        return pageInfo;
//    }


    @GetMapping("/seletAllOut")
    public List<Warehous> selectAllOut(){
        return warehousService.queryAllOut();
    }

    //根据运单id查询出库信息
    @GetMapping("/selectOneByBill/{waybillId}")
    public Warehous selectOneByBill(@PathVariable("waybillId") int waybillId) {
        //通过用户输入的运单号 查询运单id
//       int id = 运单service.selectidBy运单号;
        //再通过运单id查询该运单id的入库信息
        return this.warehousService.queryAllByBill(waybillId);

    }
}
