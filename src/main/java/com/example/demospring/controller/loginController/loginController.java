package com.example.demospring.controller.loginController;

import com.example.demospring.Service.UserService.UserService;
import com.example.demospring.entity.Result;
import com.example.demospring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;
@RestController
public class loginController {

    @Autowired
    UserService userService;
    HttpSession session;
    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        User user = userService.get(username, requestUser.getPassword());
        if (null == user) {
            return new Result(400);
        } else {
            session.setAttribute("user",user);
            return new Result(200);
        }
    }
}
