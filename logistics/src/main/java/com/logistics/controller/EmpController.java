package com.logistics.controller;

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
public class EmpController {
    /**
     * 服务对象
     */
    @Resource
    private EmpService empService;

    @GetMapping("/selectAllEmps")
    public PageInfo<EmpVo> selectAllEmps(@RequestParam("currentPage")int currentPage, @RequestParam("pagesize")int pageSize,
                                         @RequestParam("approval")String approval, @RequestParam("value1")String value){
        PageHelper.startPage(currentPage,pageSize);
        if(approval.equals(0)||value.equals("")){
            List<EmpVo> list = empService.selectAllEmps3(value);
            PageInfo<EmpVo> pageInfo = new PageInfo<>(list);
            return pageInfo;
        }else{
            List<EmpVo> list = empService.selectAllEmps2(Integer.parseInt(approval),value);
            PageInfo<EmpVo> pageInfo = new PageInfo<>(list);
            return pageInfo;
        }
        /*List<EmpVo> list = empService.selectAllEmps2(Integer.parseInt(approval),value);
        PageInfo<EmpVo> pageInfo = new PageInfo<>(list);*/

       /* return pageInfo;*/
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
}
