package com.logistics.service.impl;

import com.logistics.dao.EmpDao;
import com.logistics.entity.Emp;
import com.logistics.service.EmpService;
import com.logistics.vo.EmpVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

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
    }
}
