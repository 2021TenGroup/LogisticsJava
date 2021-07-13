package com.logistics.controller;

import com.logistics.entity.Orders;
import com.logistics.entity.OrdersAll;
import com.logistics.entity.result.Result;
import com.logistics.entity.result.ResultCode;
import com.logistics.service.OrdersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Orders)表控制层
 *
 * @author makejava
 * @since 2021-07-13 04:36:31
 */
@RestController
@RequestMapping("/orders")
public class OrdersController {
    /**
     * 服务对象
     */
    @Resource
    private OrdersService ordersService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Orders selectOne(Integer id) {
        return this.ordersService.queryById(id);
    }

    //查询所有的未录入的订单信息
    @GetMapping("/list")
    public Result selAllOrders(){
        List<Orders> list= ordersService.selAllOrders();
        return new Result(ResultCode.SUCCESS,list);
    }
    //查询所有未录入和已录入的订单信息
    @GetMapping("/listAll")
    public List<Orders> selAllOrdersAndwaybill(){
        return ordersService.selAllOrdersAndwaybill();
    }

    //插入订单
    @PostMapping("/addOrders")
    public Result addOrders(@RequestBody OrdersAll ordersAll){
        ordersService.addOrders(ordersAll);
        return new Result(ResultCode.SUCCESS);
    }

    //删除
    @PutMapping("/del")
    public Result delOrder(@RequestBody Orders orders)  {
        System.out.println(orders.getOId());
        orders.setTimeliness(1);
        ordersService.deleteByOrders(orders);
        return new Result(ResultCode.SUCCESS);
    }

    //修改订单录入
    @PutMapping("/updOrdersM")
    public Result updOrdersM(@RequestBody OrdersAll orders)  {
        ordersService.updOrdersW(orders);
        return new Result(ResultCode.SUCCESS);
    }

    //修改订单录入
    @PutMapping("/updOrders/{id}")
    public Result updOrders(@RequestBody Orders orders,@PathVariable int id)  {
        orders.setOId(id);
        System.out.println(orders);
        ordersService.update(orders);
        return new Result(ResultCode.SUCCESS);
    }


}
