/**
 * FileName: StudentServiceImpl
 * Author: 曹俊
 * Date: 2018/7/23 16:15
 * Description:
 */
package com.cj.jenkins.service.impl;

import com.cj.jenkins.dao.StudentMapper;
import com.cj.jenkins.model.Student;
import com.cj.jenkins.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StudentServiceImpl")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public Student query(String id) {
        return studentMapper.query(id);
    }
}
