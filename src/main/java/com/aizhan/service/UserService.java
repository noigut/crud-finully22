package com.aizhan.service;

import com.aizhan.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    void addUser(User user);
    List<User> listUsers();
    void deleteUser(Long id);
    Optional<User> getById(Long id);
    User findByUsername(String username);
    void saveUser(User user);
}
