package com.aizhan.service;

import com.aizhan.entity.User;
import com.aizhan.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
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
        return (List<User>) repository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<User> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public void saveUser(User user) {
        repository.save(user);
    }
}
