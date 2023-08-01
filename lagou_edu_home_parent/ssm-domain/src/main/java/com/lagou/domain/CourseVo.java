package com.lagou.domain;

/**
 * VO:View Object 表现层对象：在表现层接受参数
 */
public class CourseVo {
    private String courseName;
    private Integer status;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
