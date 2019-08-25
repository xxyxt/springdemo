package com.example.demospring.Service.UserService;

import com.example.demospring.entity.User;


import com.example.demospring.mapping.userMap.UserMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImple implements UserService {
    @Autowired
    public UserMap usermap;
    @Override
    public boolean isExist(String username){
        User user = getByName(username);
        return null!=user;

    }
    @Override
    public User getByName(String username){
        return usermap.findByUsername(username);

    }
    @Override
    public User get(String username, String password){
        return usermap.getByUsernameAndPassword(username, password);
    }
    @Override
    public void add(User user){
        usermap.add(user);
    }

}
