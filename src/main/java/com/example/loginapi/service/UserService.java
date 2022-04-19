package com.example.loginapi.service;

import com.example.loginapi.entity.Users;

import java.util.List;

public interface UserService {
//    List<Users> checkLogin(String user, String pass);
    String checkLogin(String user, String pass);
}
