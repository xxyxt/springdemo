package com.example.demospring.mapping.studentMap;


import com.example.demospring.entity.student;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;


@Mapper
public interface queryinfo {
    List<student> query();

    void insert(student stu);
}
