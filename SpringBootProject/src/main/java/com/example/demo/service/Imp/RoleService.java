package com.example.demo.service.Imp;

import com.example.demo.dto.RoleDTO;

import java.util.List;

//obfucate
public interface RoleService {
    List<RoleDTO> getAllRole();
    List<RoleDTO> getRoleByName(String name);
}
