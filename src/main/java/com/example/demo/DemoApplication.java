package com.example.demo;

import org.apache.ibatis.type.MappedTypes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.example.demo.models.User;


@MappedTypes(User.class)
@MapperScan("com.example.demo.mapper")
@ComponentScan({
	"com.example.demo.mapper",
	"com.example.demo.models", 
	"com.example.demo.servermappings"})
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
