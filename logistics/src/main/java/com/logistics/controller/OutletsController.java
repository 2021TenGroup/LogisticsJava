package com.logistics.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.entity.Outlets;
import com.logistics.service.OutletsService;
import com.logistics.vo.AjaxResponse;
import com.logistics.vo.OutletsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * (Outlets)表控制层
 *
 * @author makejava
 * @since 2021-07-11 14:38:04
 */
@RestController
@Slf4j
public class OutletsController {
    /**
     * 服务对象
     */
    @Resource
    private OutletsService outletsService;

    @GetMapping("/selectAllOutlets")
    public PageInfo<OutletsVo> selectAllOutlets(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<OutletsVo> list = outletsService.selectAllOutlets();
        PageInfo<OutletsVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @GetMapping("/selectAllOutletsList")
    public AjaxResponse selectAllOutletsList(){
        List<OutletsVo> list = outletsService.selectAllOutlets();
        return AjaxResponse.success(list);
    }

    @GetMapping("/selectOutletsById/{id}")
    public AjaxResponse selectOutletsById(@Valid @PathVariable("id") int id){
        OutletsVo list = outletsService.selectOutletsById(id);
        return AjaxResponse.success(list);
    }

    @PostMapping("/addOutlets")
    public AjaxResponse addClassType(@RequestBody @Valid OutletsVo outletsVo){
        Date date = new Date();
        outletsVo.setAddtime(date);
        outletsService.addOutlets(outletsVo);
        return AjaxResponse.success(outletsVo);
    }

    @PutMapping("/updateOutlets")
    public AjaxResponse updateClassType(@RequestBody @Valid OutletsVo outletsVo){
        /*System.out.println(classTypeVo+"-------------------");*/
        Date date = new Date();
        outletsVo.setUpdatetime(date);
        outletsService.updateOutlets(outletsVo);
        return  AjaxResponse.success(outletsVo);
    }

    @PutMapping("/delOutletsVo")
    public AjaxResponse deleteByClassType(@RequestBody @Valid OutletsVo outletsVo){
        Date date = new Date();
        outletsVo.setDeletetime(date);
        outletsVo.setTimeliness(1);
        outletsService.delOutletsVo(outletsVo);
        return AjaxResponse.success(outletsVo);
    }

}
