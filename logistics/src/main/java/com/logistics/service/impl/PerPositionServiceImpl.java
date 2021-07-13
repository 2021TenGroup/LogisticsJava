package com.logistics.service.impl;

import com.logistics.dao.PerPositionDao;
import com.logistics.entity.PerPosition;
import com.logistics.service.PerPositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PerPositionServiceImpl implements PerPositionService {
    @Resource
    private PerPositionDao perPositionDao;
    @Override
    public PerPosition queryById(Integer positionId) {
        return null;
    }

    @Override
    public List<PerPosition> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public PerPosition insert(PerPosition perPosition) {
        return null;
    }

    @Override
    public PerPosition update(PerPosition perPosition) {
        return null;
    }

    @Override
    public boolean deleteById(Integer positionId) {
        return false;
    }
}
