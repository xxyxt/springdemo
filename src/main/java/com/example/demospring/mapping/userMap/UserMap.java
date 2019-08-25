package com.example.demospring.mapping.userMap;

import com.example.demospring.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMap {
    void add(User user);
    User findByUsername(String username);
    User getByUsernameAndPassword(String username, String password);
}
