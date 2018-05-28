package com.hpeu.oa.service;

import java.util.List;

public interface BaseService<T> {

    public int add(T entity) throws Exception;

    public int del(int id);

    public int update(T entity , int id);

    public T getEntity(String title);

    public List<T> getAll();
}
