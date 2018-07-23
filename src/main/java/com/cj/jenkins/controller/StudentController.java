/**
 * FileName: StudentController
 * Author: 曹俊
 * Date: 2018/7/23 16:17
 * Description:
 */
package com.cj.jenkins.controller;

import com.cj.jenkins.model.Student;
import com.cj.jenkins.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService StudentServiceImpl;

    @GetMapping("/getStudent/{id}")
    public Student get(@PathVariable(name="id") String id){
       return (StudentServiceImpl.query(id));
    }

}
