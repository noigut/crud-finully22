package com.talant.service;

import com.talant.entity.User;
import com.talant.repository.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addUser(User user) {
        repository.save(user);
    }

    @Override
    public List<User> listUsers() {
        return repository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }

    @Override
    public User getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        "user with id = " + id + " does not exists"
                ));
    }

    @Override
    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }
}
