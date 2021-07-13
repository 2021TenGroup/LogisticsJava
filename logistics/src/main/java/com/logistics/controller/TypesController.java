package com.logistics.controller;

import com.logistics.entity.Types;
import com.logistics.entity.result.Result;
import com.logistics.entity.result.ResultCode;
import com.logistics.service.TypesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Types)表控制层
 *
 * @author makejava
 * @since 2021-07-13 11:07:55
 */
@RestController
@RequestMapping("/types")
public class TypesController {
    /**
     * 服务对象
     */
    @Resource
    private TypesService typesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Types selectOne(Integer id) {
        return this.typesService.queryById(id);
    }

    //添加类型维护
    @PostMapping("/add")
    public Result addTypes(@RequestBody Types types){
        typesService.addTypes(types);
        return new Result(ResultCode.SUCCESS);
    }

    //查询所有类型维护数据
    @GetMapping("/selAll")
    public Result selAllTypes(){
        List<Types> list= typesService.selAllTypes();
        return new Result(ResultCode.SUCCESS,list);
    }


    @PutMapping("/del")
    public Result delTypes(@RequestBody Types types){
        System.out.println(types.getTypeId());
        types.setTimeliness(1);
        typesService.deleteByTypes(types);
        return new Result(ResultCode.SUCCESS);
    }


}
