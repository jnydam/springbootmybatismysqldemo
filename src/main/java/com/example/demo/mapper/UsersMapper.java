package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.models.User;

@Mapper
public interface UsersMapper {

    @Select("select * from users")
    List<User> findAll();
    
}
