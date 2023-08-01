package com.lagou.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.lagou.domain.Course;
import com.lagou.domain.CourseVo;
import com.lagou.domain.ResponseResult;
import com.lagou.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Course")
@EnableTransactionManagement
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("findCourseByCondition")
    public ResponseResult findAllByCondition(@RequestBody CourseVo courseVo){
        PageInfo<Course> list = courseService.findAllByCondition(courseVo);
        ResponseResult result = new ResponseResult(true, 200, "响应成功", list);
        return result;
    }

    @RequestMapping("findCourse")
    public ResponseResult findCourse(){
        List<Course> course = courseService.findCourse();
        return new ResponseResult(true, 200, "响应成功", course);
    }
}
