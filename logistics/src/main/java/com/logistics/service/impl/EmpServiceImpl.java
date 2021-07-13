package com.logistics.service.impl;

<<<<<<< HEAD
import com.logistics.entity.Emp;
import com.logistics.dao.EmpDao;
import com.logistics.service.EmpService;
import org.springframework.stereotype.Service;
=======
import com.logistics.dao.EmpDao;
import com.logistics.entity.Emp;
import com.logistics.service.EmpService;
import com.logistics.vo.EmpVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3

import javax.annotation.Resource;
import java.util.List;

<<<<<<< HEAD
/**
 * (Emp)表服务实现类
 *
 * @author makejava
 * @since 2021-07-13 04:36:28
 */
@Service("empService")
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpDao empDao;

    /**
     * 通过ID查询单条数据
     *
     * @param empId 主键
     * @return 实例对象
     */
    @Override
    public Emp queryById(Integer empId) {
        return this.empDao.queryById(empId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Emp> queryAllByLimit(int offset, int limit) {
        return this.empDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param emp 实例对象
     * @return 实例对象
     */
    @Override
    public Emp insert(Emp emp) {
        this.empDao.insert(emp);
        return emp;
    }

    /**
     * 修改数据
     *
     * @param emp 实例对象
     * @return 实例对象
     */
    @Override
    public Emp update(Emp emp) {
        this.empDao.update(emp);
        return this.queryById(emp.getEmpId());
    }

    /**
     * 通过主键删除数据
     *
     * @param empId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer empId) {
        return this.empDao.deleteById(empId) > 0;
=======
@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpDao empDao;
    @Override
    public Emp queryById(Integer empId) {
        return null;
    }

    @Override
    public List<Emp> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    @Transactional
    public Emp insert(Emp emp) {
        return null;
    }

    @Override
    @Transactional
    public Emp update(Emp emp) {
        return null;
    }

    @Override
    @Transactional
    public boolean deleteById(Integer empId) {
        return false;
    }

    @Override
    public List<EmpVo> selectAllEmps() {
        return empDao.selectAllEmps();
    }

    @Override
    @Transactional
    public void addEmps(EmpVo empVo) {
        empDao.insert(empVo);
    }

    @Override
    @Transactional
    public int updateEmps(EmpVo empVo) {
        return empDao.update(empVo);
    }

    @Override
    @Transactional
    public int deleteByEmps(EmpVo empVo) {
        return empDao.deleteByEmps(empVo);
>>>>>>> 2cc712e36903caa7b2d926bd87cb08cddaac9df3
    }
}
