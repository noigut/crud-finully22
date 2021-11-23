//package com.aizhan.controller;
//
//import com.aizhan.entity.User;
//import com.aizhan.service.UserService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.security.Principal;
//
//@Controller
//@RequestMapping("/")
//public class UserPageController {
//
//    UserService userService;
//
//    public UserPageController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/user")
//    public String getUser(Principal principal, Model model){
//        User user = userService.findByUsername(principal.getName());
//        model.addAttribute("user",user);
//        return "user";
//    }
//}
