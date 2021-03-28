package com.oxygen.demo.controller;


import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-54-security-jwt-demo
 * @description:
 * @author: 波波烤鸭
 * @create: 2019-12-03 11:55
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/query")
    public String query(){
        return "success";
    }

    @RequestMapping("/update")
    public String update(){
        return "update";
    }
}

