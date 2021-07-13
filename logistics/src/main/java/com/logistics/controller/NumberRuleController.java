package com.logistics.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.entity.NumberRule;
import com.logistics.service.NumberRuleService;
import com.logistics.vo.AjaxResponse;
import com.logistics.vo.EmpVo;
import com.logistics.vo.NumberRuleVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * (NumberRule)表控制层
 *
 * @author makejava
 * @since 2021-07-11 19:20:13
 */
@RestController
@Slf4j
public class NumberRuleController {
    /**
     * 服务对象
     */
    @Resource
    private NumberRuleService numberRuleService;

    @GetMapping("/selectAllNumberRule")
    public PageInfo<NumberRuleVo> selectAllNumberRule(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<NumberRuleVo> list = numberRuleService.selectAllNumberRule();
        PageInfo<NumberRuleVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @GetMapping("/selectAllNumberRuleList")
    public List<NumberRuleVo> selectAllNumberRuleList(){
        List<NumberRuleVo> list = numberRuleService.selectAllNumberRule();
        return list;
    }

    @PostMapping("/addNumberRule")
    public AjaxResponse addNumberRule(@RequestBody @Valid NumberRuleVo numberRuleVo){
        Date date = new Date();
        numberRuleVo.setAddtime(date);
        numberRuleService.addNumberRule(numberRuleVo);
        return AjaxResponse.success(numberRuleVo);
    }

    @PutMapping("/updateNumberRule")
    public AjaxResponse updateNumberRule(@RequestBody @Valid NumberRuleVo numberRuleVo){
        /*System.out.println(classTypeVo+"-------------------");*/
        Date date = new Date();
        numberRuleVo.setUpdatetime(date);
        numberRuleService.updateNumberRule(numberRuleVo);
        return  AjaxResponse.success(numberRuleVo);
    }

    @PutMapping("/deleteByNumberRule")
    public AjaxResponse deleteByNumberRule(@RequestBody @Valid NumberRuleVo numberRuleVo){
        Date date = new Date();
        numberRuleVo.setDeletetime(date);
        numberRuleVo.setTimeliness(1);
        numberRuleService.deleteByNumberRule(numberRuleVo);
        return AjaxResponse.success(numberRuleVo);
    }
}
