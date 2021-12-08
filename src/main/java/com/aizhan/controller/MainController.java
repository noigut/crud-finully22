package com.aizhan.controller;

import com.aizhan.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/main-page")
    public String mainController(){
        return "main-page";
    }

    @GetMapping("/admin-page")
    public String adminPage(){
        return "users";
    }

    @GetMapping("/user")
    public String getUser(){
//        User user = userService.findByUsername(principal.getName());
//        model.addAttribute("user",user);
        return "user";
    }

//
//    @GetMapping("/user")
//    public String getUser(Principal principal, Model model){
//        User user = userService.findByUsername(principal.getName());
//        model.addAttribute("user",user);
//        return "user";
//    }

}
