/**
 * FileName: Student
 * Author: 曹俊
 * Date: 2018/7/23 16:13
 * Description:
 */
package com.cj.jenkins.model;
public class Student {
    private  String id;
    private  String name;
    private  int age;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
