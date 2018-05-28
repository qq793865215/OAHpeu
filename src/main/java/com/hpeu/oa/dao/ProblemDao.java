package com.hpeu.oa.dao;

import com.hpeu.oa.entity.Problem;

import java.util.List;

public interface ProblemDao extends BaseDao<Problem> {

    public List<Problem> getAll();

}
