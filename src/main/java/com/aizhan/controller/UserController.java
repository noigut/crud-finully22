package com.aizhan.controller;

import com.aizhan.entity.Role;
import com.aizhan.entity.User;
import com.aizhan.service.RoleService;
import com.aizhan.service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;
    private RoleService roleService;

    public UserController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }


    @CrossOrigin
    @GetMapping("/admin")
    public List<User> get() {
        List<User> users = new ArrayList<>();
        for (User user : userService.listUsers()) {
            users.add(new User(user.getId(), user.getName(), user.getSurname(), user.getEmail()));
        }
        return users.stream().sorted(Comparator.comparing(User::getId)).collect(Collectors.toList());
    }


    @CrossOrigin
    @PostMapping("/save-user")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        try {
            Set<Role> roles = new HashSet<>();
            roles.add(roleService.getRoleByName("ROLE_USER"));
            user.setRoles(roles);
            return new ResponseEntity<>(userService.saveUser(user), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    @PutMapping("/update ")
    @CrossOrigin
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        try {
            Set<Role> roles = new HashSet<>();
            roles.add(roleService.getRoleByName("ROLE_USER"));
            user.setRoles(roles);
            return new ResponseEntity<>(
                    userService.saveUser(user), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    @DeleteMapping("/delete/{id}")
    @CrossOrigin
    public String deleteUser(@PathVariable("id") Long userId) {
        try {
            userService.deleteUser(userId);
            return "User with ID = " + userId + " was successfully deleted.";
        } catch (Exception e) {
            return String.valueOf(HttpStatus.BAD_REQUEST);
        }
    }
}
