package com.dbs.springmvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/users")
public class EmployeeController {

    @GetMapping(value = "/login")
    public String login(Model model){
        System.out.println("Came inside the login method ");

        return "login";
    }

    @PostMapping("/login")
    public String loginUser(
            @RequestParam("username")String username,
            @RequestParam("password") String password,
            Model model){
        System.out.println("Inside the POST method of login user");
        System.out.println("Username is "+username + " password is "+ password);
        if(username.equalsIgnoreCase(password)){
            model.addAttribute("user", username);
            return "success";
        }
        return "login";
    }
}