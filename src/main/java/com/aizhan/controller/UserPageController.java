package com.aizhan.controller;

import com.aizhan.entity.User;
import com.aizhan.service.UserService;

import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class UserPageController {

    private UserService userService;

    public UserPageController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/page")
    public User getUser(Principal principal){
        User user = userService.findByUsername(principal.getName());
        user = new User(user.getId(),user.getName(),user.getSurname(),user.getEmail());
        return user;
    }

    @GetMapping("/adminPage")
    public User getAdmin(Principal principal){
        User user = userService.findByUsername(principal.getName());
        user = new User(user.getId(),user.getName(),user.getSurname(),user.getEmail());
        return user;
    }

}
