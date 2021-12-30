package com.talant.service;

import com.talant.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void addUser(User user);
    List<User> listUsers();
    void deleteUser(Long id);
    User getById(Long id);
    User findByUsername(String username);
    User saveUser(User user);
}
