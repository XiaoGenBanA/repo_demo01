package com.lagou.dao;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVo;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
public interface CourseMapper {
    public List<Course> findAllByCondition(CourseVo courseVo);
    public List<Course> findCourse();
}
