/**
 * FileName: Student
 * Author: 曹俊
 * Date: 2018/7/23 16:13
 * Description:
 */
package com.cj.jenkins.dao;

import com.cj.jenkins.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface StudentMapper {
    Student query(String id);
}
