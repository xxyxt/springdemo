package com.example.demospring.Service.studentService;

import com.example.demospring.entity.student;
import com.example.demospring.mapping.studentMap.queryinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceStudentImple implements serviceStudent {
    @Autowired(required=true)
    private queryinfo queryInfo;
    @Override
    public List<student> query(){
        return queryInfo.query();
    }
    @Override
    public void insert(student stu){
        queryInfo.insert(stu);
    }

}
