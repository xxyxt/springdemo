package com.example.demospring.Service.studentService;

import com.example.demospring.entity.student;

import java.util.List;


public interface serviceStudent {
    List<student> query();
    public void insert(student stu);
}
