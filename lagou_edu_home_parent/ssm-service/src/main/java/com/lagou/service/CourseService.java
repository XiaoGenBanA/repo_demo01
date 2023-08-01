package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.Course;
import com.lagou.domain.CourseVo;

import java.util.List;

public interface CourseService {
    public PageInfo<Course> findAllByCondition(CourseVo courseVo);
    public List<Course> findCourse();
}
