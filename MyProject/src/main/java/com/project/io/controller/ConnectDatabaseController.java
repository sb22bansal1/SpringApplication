package com.project.io.controller;

 
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;  
@Transactional
@RestController  
public class ConnectDatabaseController{  
    @Autowired  
    private JdbcTemplate jdbc;    
    
    @RequestMapping("/insert")  
    public String index(){  
        jdbc.execute("insert into abc values(2)");  
        return "data inserted Successfully";  
//    List<String> user=new ArrayList<String>();
//    user.addAll(jdbc.queryForList("select * from abc", String.class));
//    return user;
    }  
}  
