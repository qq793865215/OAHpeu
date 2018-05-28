package com.hpeu.oa.service.impl;

import com.hpeu.oa.dao.ProblemDao;
import com.hpeu.oa.entity.Problem;
import com.hpeu.oa.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemServiceImpl implements ProblemService {

    @Autowired
    private ProblemDao problemDao;

    @Override
    public int add(Problem entity) throws Exception {
        return 0;
    }

    @Override
    public int del(int id) {
        return 0;
    }

    @Override
    public int update(Problem entity, int id) {
        return 0;
    }

    @Override
    public Problem getEntity(String title) {
        return null;
    }

    @Override
    public List<Problem> getAll() {
        return problemDao.getAll();
    }
}
