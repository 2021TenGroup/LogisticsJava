package com.logistics.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.entity.Numberlssue;
import com.logistics.service.NumberlssueService;
import com.logistics.vo.AjaxResponse;
import com.logistics.vo.NumberRuleVo;
import com.logistics.vo.NumberlssueVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * (Numberlssue)表控制层
 *
 * @author makejava
 * @since 2021-07-11 19:35:33
 */
@RestController
public class NumberlssueController {
    /**
     * 服务对象
     */
    @Resource
    private NumberlssueService numberlssueService;

    @GetMapping("/selectAllNumberLssue")
    public PageInfo<NumberlssueVo> selectAllNumberLssue(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<NumberlssueVo> list = numberlssueService.selectAllNumberLssue();
        PageInfo<NumberlssueVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @GetMapping("/selectAllNumberLssueList")
    public List<NumberlssueVo> selectAllNumberLssueList(){
        List<NumberlssueVo> list = numberlssueService.selectAllNumberLssue();
        return list;
    }

    @PostMapping("/addNumberLssue")
    public AjaxResponse addNumberLssue(@RequestBody @Valid NumberlssueVo numberRuleVo){
        Date date = new Date();
        numberRuleVo.setAddtime(date);
        numberlssueService.addNumberLssue(numberRuleVo);
        return AjaxResponse.success(numberRuleVo);
    }

    @PutMapping("/updateNumberLssue")
    public AjaxResponse updateNumberLssue(@RequestBody @Valid NumberlssueVo numberRuleVo){
        /*System.out.println(classTypeVo+"-------------------");*/
        Date date = new Date();
        numberRuleVo.setUpdatetime(date);
        numberlssueService.updateNumberLssue(numberRuleVo);
        return  AjaxResponse.success(numberRuleVo);
    }

    @PutMapping("/deleteByNumberLssue")
    public AjaxResponse deleteByNumberLssue(@RequestBody @Valid NumberlssueVo numberRuleVo){
        Date date = new Date();
        numberRuleVo.setDeletetime(date);
        numberRuleVo.setTimeliness(1);
        numberlssueService.deleteByNumberLssue(numberRuleVo);
        return AjaxResponse.success(numberRuleVo);
    }

}
