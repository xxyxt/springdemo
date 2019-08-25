package com.example.demospring.controller.student;

import com.example.demospring.Service.studentService.serviceStudent;
import com.example.demospring.entity.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class studentOperate {
    @Autowired
    private serviceStudent servicestudent;
    @RequestMapping("/query")
    public List<student> query(){
        return servicestudent.query();
    }
    @RequestMapping("/insert")
    public void insert(student stu){
        stu.setId(10);
        stu.setName("xxy");
        servicestudent.insert(stu);
    }

}
