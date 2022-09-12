package com.example.demo.servermappings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ListBusinessMapping;

@RestController
@RequestMapping("/rest/list")
public class ListController {

    @GetMapping("/")
    public ListBusinessMapping index() {

        ListBusinessMapping newListBusinessMapping = new ListBusinessMapping("newname");

        return newListBusinessMapping;
    }
    
}
