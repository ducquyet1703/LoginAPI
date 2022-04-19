package com.example.loginapi.service.impl;


import com.example.loginapi.entity.Users;
import com.example.loginapi.repository.UserRepository;
import com.example.loginapi.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class UseServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UseServiceImpl(UserRepository userRepository) {this.userRepository = userRepository;}

//    @Override
//    public List<Users> checkLogin(String user, String pass) {
//        return userRepository.findUser(user, pass);
//    }

    @Override
    public String checkLogin(String user, String pass) {
        String message = new String();
        List<Users> users =  userRepository.findAll();
        for(Users b: users) {
            if(b.getUsername().equals(user) && b.getPassword().equals(pass)){
                message = "Đăng nhập thành công";
                break;
            }else {
                message =  "Tài khoản hoặc mật khẩu sai";
            }
        }
        return message;
    }

}
