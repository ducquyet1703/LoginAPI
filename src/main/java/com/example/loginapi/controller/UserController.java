package com.example.loginapi.controller;

import com.example.loginapi.entity.Users;
import com.example.loginapi.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;
import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {this.userService = userService;}

    @PostMapping("/loginDTS")
    public String login (@RequestBody Users user) {
        return userService.checkLogin(user.getUsername(), user.getPassword());
    }
//    @PostMapping("/loginDTS")
//    public List<Users> login (@RequestBody Users user) {
//        return userService.checkLogin(user.getUsername(), user.getPassword());
//    }

}
