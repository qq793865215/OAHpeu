package com.hpeu.oa.service;

import com.hpeu.oa.entity.Course;

public interface CourseService extends BaseService<Course> {
    public Course getInfo(String title);
}
