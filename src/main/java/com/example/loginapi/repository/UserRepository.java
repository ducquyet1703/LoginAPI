package com.example.loginapi.repository;

import com.example.loginapi.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Integer> {
//    @Query(value = "SELECT * FROM login WHERE username = ?1 AND password = ?2", nativeQuery=true)
//    List<Users> findUser(String username, String password);
}
