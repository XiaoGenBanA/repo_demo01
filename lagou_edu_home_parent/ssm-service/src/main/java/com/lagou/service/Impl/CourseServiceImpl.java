package com.lagou.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lagou.dao.CourseMapper;
import com.lagou.domain.Course;
import com.lagou.domain.CourseVo;
import com.lagou.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public PageInfo<Course> findAllByCondition(CourseVo courseVo) {
        //传递分页参数
        //查询返回结果
        //封装到pageInfo中 返回其他分页参数
        Page<Course> page = PageHelper.startPage(3, 2);
        List<Course> list = courseMapper.findAllByCondition(courseVo);
        PageInfo<Course> pageInfo = new PageInfo<>(list);
        File file = new File("","");
        return pageInfo;
    }

    @Override
    public List<Course> findCourse() {
        return courseMapper.findCourse();
    }
}
