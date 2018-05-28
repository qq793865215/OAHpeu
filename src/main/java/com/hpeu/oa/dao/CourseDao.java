package com.hpeu.oa.dao;

import com.hpeu.oa.entity.Course;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;

public interface CourseDao extends BaseDao<Course> {
    /**
     * 存储课程推送内容
     *
     * @param title
     * @param abs
     * @param content
     * @return
     */
    public void issue(@Param("title") String title, @Param("abs") String abs, @Param("content") String content, @Param("putDate") Timestamp putDate);

    /**
     * 查询所有课程内容
     * @return
     */
    public List<Course> getAll();

    /**
     * 删除一条数据
     * @param id
     */
    public void del(@Param("id")int id);

    /**
     * 查询一条数据
     * @param title
     * @return
     */

    public Course getEntity(@Param("title")String title);

    /**
     * 搜索
     * @param title
     * @return
     */
    public Course getInfo(@Param("title")String title);
}
