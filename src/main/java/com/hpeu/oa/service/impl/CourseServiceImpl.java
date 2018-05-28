package com.hpeu.oa.service.impl;

import com.hpeu.oa.dao.CourseDao;
import com.hpeu.oa.entity.Course;
import com.hpeu.oa.exception.ServiceException;
import com.hpeu.oa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public int add(Course course) throws ServiceException {
        try {
            courseDao.issue(course.getTitle(), course.getAbs(), course.getContent(), course.getPutDate());
            return 1;
        }catch (Exception e){
            throw new ServiceException("添加异常");
        }
    }

    @Override
    public int del(int id) {
        courseDao.del(id);
        return 1;
    }

    @Override
    public int update(Course entity, int id) {
        return 0;
    }

    @Override
    public Course getEntity(String title) {
        return courseDao.getEntity(title);
    }

    @Override
    public List<Course> getAll() {
        return courseDao.getAll();
    }

    @Override
    public Course getInfo(String title) {
        return courseDao.getInfo(title);
    }
}
