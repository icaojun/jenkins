/**
 * FileName: StudentService
 * Author: 曹俊
 * Date: 2018/7/23 16:14
 * Description:
 */
package com.cj.jenkins.service;

import com.cj.jenkins.model.Student;
public interface StudentService {
    Student query(String id);
}
