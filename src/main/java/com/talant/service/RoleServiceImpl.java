package com.talant.service;

import com.talant.entity.Role;
import com.talant.repository.RoleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public List<String> getNamesOfRolesToList() {
        List<Role> roleList = roleRepository.findAll();
        List<String> stringList = roleList.stream()
                .map((role) -> role.getRole()).collect(Collectors.toList());
        stringList.forEach(System.out::println);
        return stringList;
    }

    @Override
    public Role getRoleByName(String role) {
        return roleRepository.getRoleByName(role);
    }
}
