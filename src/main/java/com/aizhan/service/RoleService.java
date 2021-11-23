package com.aizhan.service;

import com.aizhan.entity.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {

    List<Role> getAllRoles();
    List<String> getNamesOfRolesToList();
    Role getRoleByName(String name);
}
