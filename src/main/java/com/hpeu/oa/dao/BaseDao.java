package com.hpeu.oa.dao;


import java.util.List;

public interface BaseDao<T> {

    public int add(T entity);

    public void del(int id);

    public int update(T entity , int id);

    public T getEntity(String title);

    public List<T> getAll();
}
