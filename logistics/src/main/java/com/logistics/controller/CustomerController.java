package com.logistics.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.entity.Customer;
import com.logistics.service.CustomerService;
import com.logistics.vo.AjaxResponse;
import com.logistics.vo.CustomerVo;
import com.logistics.vo.OutletsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * (Customer)表控制层
 *
 * @author makejava
 * @since 2021-07-11 15:28:26
 */
@RestController
@Slf4j
public class CustomerController {
    /**
     * 服务对象
     */
    @Resource
    private CustomerService customerService;

    @GetMapping("/selectAllCustomer")
    public PageInfo<CustomerVo> selectAllCustomer(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<CustomerVo> list = customerService.selectAllCustomer();
        PageInfo<CustomerVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @GetMapping("/selectAllCustomerList")
    public AjaxResponse selectAllCustomerList(){
        List<CustomerVo> list = customerService.selectAllCustomer();
        return AjaxResponse.success(list);
    }

    @PostMapping("/addCustomer")
    public AjaxResponse addCustomer(@RequestBody @Valid CustomerVo customerVo){
        Date date = new Date();
        customerVo.setAddtime(date);
        customerService.addCustomer(customerVo);
        return AjaxResponse.success(customerVo);
    }

    @PutMapping("/updateCustomer")
    public AjaxResponse updateCustomer(@RequestBody @Valid CustomerVo customerVo){
        /*System.out.println(classTypeVo+"-------------------");*/
        Date date = new Date();
        customerVo.setUpdatetime(date);
        customerService.updateCustomer(customerVo);
        return  AjaxResponse.success(customerVo);
    }

    @PutMapping("/delCustomer")
    public AjaxResponse delCustomer(@RequestBody @Valid CustomerVo customerVo){
        Date date = new Date();
        customerVo.setDeletetime(date);
        customerVo.setTimeliness(1);
        customerService.delCustomer(customerVo);
        return AjaxResponse.success(customerVo);
    }

}
