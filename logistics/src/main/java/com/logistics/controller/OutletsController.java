package com.logistics.controller;

<<<<<<< HEAD
import com.logistics.entity.Outlets;
import com.logistics.service.OutletsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
=======
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
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3

/**
 * (Outlets)表控制层
 *
 * @author makejava
<<<<<<< HEAD
 * @since 2021-07-13 04:36:31
 */
@RestController
@RequestMapping("outlets")
=======
 * @since 2021-07-11 14:38:04
 */
@RestController
@Slf4j
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3
public class OutletsController {
    /**
     * 服务对象
     */
    @Resource
    private OutletsService outletsService;

<<<<<<< HEAD
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Outlets selectOne(Integer id) {
        return this.outletsService.queryById(id);
=======
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
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3
    }

}
