package com.example.demospring.Service.UserService;

import com.example.demospring.entity.User;

public interface UserService {
    boolean isExist(String username);
    User getByName(String username);
    User get(String username, String password);
    void add(User user);

}
