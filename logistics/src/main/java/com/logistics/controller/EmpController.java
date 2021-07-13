package com.logistics.controller;

<<<<<<< HEAD
import com.logistics.entity.Emp;
import com.logistics.service.EmpService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Emp)表控制层
 *
 * @author makejava
 * @since 2021-07-13 04:36:28
 */
@RestController
@RequestMapping("emp")
=======
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.entity.Emp;
import com.logistics.service.EmpService;
import com.logistics.vo.AjaxResponse;
import com.logistics.vo.CustomerVo;
import com.logistics.vo.EmpVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * (EmpVo)表控制层
 *
 * @author makejava
 * @since 2021-07-11 16:35:39
 */
@RestController
@Slf4j
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3
public class EmpController {
    /**
     * 服务对象
     */
    @Resource
    private EmpService empService;

<<<<<<< HEAD
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Emp selectOne(Integer id) {
        return this.empService.queryById(id);
    }

=======
    @GetMapping("/selectAllEmps")
    public PageInfo<EmpVo> selectAllEmps(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        List<EmpVo> list = empService.selectAllEmps();
        PageInfo<EmpVo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @GetMapping("/selectAllEmpsList")
    public List<EmpVo> selectAllEmpsList(){
        List<EmpVo> list = empService.selectAllEmps();
        return list;
    }

    @PostMapping("/addEmps")
    public AjaxResponse addEmps(@RequestBody @Valid EmpVo empVo){
        Date date = new Date();
        empVo.setAddtime(date);
        empService.addEmps(empVo);
        return AjaxResponse.success(empVo);
    }

    @PutMapping("/updateEmps")
    public AjaxResponse updateEmps(@RequestBody @Valid EmpVo empVo){
        /*System.out.println(classTypeVo+"-------------------");*/
        Date date = new Date();
        empVo.setUpdatetime(date);
        empService.updateEmps(empVo);
        return  AjaxResponse.success(empVo);
    }

    @PutMapping("/deleteByEmps")
    public AjaxResponse deleteByEmps(@RequestBody @Valid EmpVo empVo){
        Date date = new Date();
        empVo.setDeletetime(date);
        empVo.setTimeliness(1);
        empService.deleteByEmps(empVo);
        return AjaxResponse.success(empVo);
    }


>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3
}
