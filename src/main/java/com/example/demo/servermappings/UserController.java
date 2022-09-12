package com.example.demo.servermappings;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.UsersMapper;
import com.example.demo.models.User;

@RestController
@RequestMapping("/rest/users")
public class UserController {

    @Autowired
    private UsersMapper usersMapper;

    @GetMapping("/all")
    public List<User> getAll() {

        

        return usersMapper.findAll();
    } 
}
