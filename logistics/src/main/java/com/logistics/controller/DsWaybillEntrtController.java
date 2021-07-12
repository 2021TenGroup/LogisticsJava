package com.logistics.controller;

import com.logistics.entity.DsWaybillEntrt;
import com.logistics.entity.result.Result;
import com.logistics.entity.result.ResultCode;
import com.logistics.service.DsWaybillEntrtService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/DsWaybillEntrt")
public class DsWaybillEntrtController {
    @Resource
    private DsWaybillEntrtService dsWaybillEntrtService;
   @GetMapping("/select")
    public Result select(@RequestBody DsWaybillEntrt dsWaybillEntrt){
       List<DsWaybillEntrt> list= dsWaybillEntrtService.selectByAll(dsWaybillEntrt);
       return new Result(ResultCode.SUCCESS,list);
   }
}
