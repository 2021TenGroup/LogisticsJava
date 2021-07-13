package com.logistics.service;

import com.logistics.entity.Outlets;
<<<<<<< HEAD
import org.apache.ibatis.annotations.Mapper;
=======
import com.logistics.vo.OutletsVo;
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3

import java.util.List;

/**
 * (Outlets)表服务接口
 *
 * @author makejava
<<<<<<< HEAD
 * @since 2021-07-13 04:36:31
 */
@Mapper
=======
 * @since 2021-07-11 14:38:04
 */
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3
public interface OutletsService {

    /**
     * 通过ID查询单条数据
     *
     * @param outletsId 主键
     * @return 实例对象
     */
    Outlets queryById(Integer outletsId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Outlets> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param outlets 实例对象
     * @return 实例对象
     */
    Outlets insert(Outlets outlets);

    /**
     * 修改数据
     *
     * @param outlets 实例对象
     * @return 实例对象
     */
    Outlets update(Outlets outlets);

    /**
     * 通过主键删除数据
     *
     * @param outletsId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer outletsId);

<<<<<<< HEAD
    //根据网点名称 获取网点信息
    Outlets queryByOutletsName(String outletsName);

=======
    /*
    * 查询所有
    * */
    List<OutletsVo> selectAllOutlets();

    void addOutlets(OutletsVo outletsVo);

    int updateOutlets(OutletsVo outletsVo);

    int delOutletsVo(OutletsVo outletsVo);

    OutletsVo selectOutletsById(int id);
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3
}
