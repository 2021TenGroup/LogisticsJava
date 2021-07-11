package com.logistics.controller;

import com.logistics.entity.DsSign;
import com.logistics.entity.result.Result;
import com.logistics.entity.result.ResultCode;
import com.logistics.service.DsSignService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/DsSign")
public class DsSignController {
    @Resource
    private DsSignService dsSignService;

    @GetMapping("/select")
    public Result selcect(@RequestBody DsSign dsSign){
        List<DsSign> list=dsSignService.queryAll(dsSign);
        return new Result(ResultCode.SUCCESS);
    }
  @PostMapping("/insert")
    public Result insert(@RequestBody DsSign dsSign){
      DsSign insert = dsSignService.insert(dsSign);
      return new Result(ResultCode.SUCCESS,insert);
  }
}
