package com.logistics.service;

import com.logistics.entity.Numberlssue;
import com.logistics.vo.NumberlssueVo;

import java.util.List;

/**
 * (Numberlssue)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 19:35:30
 */
public interface NumberlssueService {

    /**
     * 通过ID查询单条数据
     *
     * @param numberlssueId 主键
     * @return 实例对象
     */
    Numberlssue queryById(Integer numberlssueId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Numberlssue> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param numberlssue 实例对象
     * @return 实例对象
     */
    Numberlssue insert(Numberlssue numberlssue);

    /**
     * 修改数据
     *
     * @param numberlssue 实例对象
     * @return 实例对象
     */
    Numberlssue update(Numberlssue numberlssue);

    /**
     * 通过主键删除数据
     *
     * @param numberlssueId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer numberlssueId);

    List<NumberlssueVo> selectAllNumberLssue();

    int deleteByNumberLssue(NumberlssueVo numberlssueVo);

    void addNumberLssue(NumberlssueVo numberlssueVo);

    int updateNumberLssue(NumberlssueVo numberlssueVo);
}
