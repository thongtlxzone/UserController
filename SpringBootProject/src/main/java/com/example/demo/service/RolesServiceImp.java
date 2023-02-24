package com.example.demo.service;

import com.example.demo.dto.RoleDTO;
import com.example.demo.entity.RolesEntity;
import com.example.demo.repository.RoleRepository;
import com.example.demo.service.Imp.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RolesServiceImp implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<RoleDTO> getAllRole() {
        List<RolesEntity> list = roleRepository.findAll();
        List<RoleDTO> listDTO = new ArrayList<>();

        for (RolesEntity roles: list){
            RoleDTO roleDTO = new RoleDTO();
            roleDTO.setId(roles.getId());
            roleDTO.setName(roles.getName());
            roleDTO.setDescription(roles.getDescription());
            listDTO.add(roleDTO);
        }
        return listDTO;
    }

    @Override
    public List<RoleDTO> getRoleByName(String name) {
        List<RolesEntity> list = roleRepository.findByName(name);
        List<RoleDTO> listDTO = new ArrayList<>();

        for (RolesEntity roles: list){
            RoleDTO roleDTO = new RoleDTO();
            roleDTO.setId(roles.getId());
            roleDTO.setName(roles.getName());
            roleDTO.setDescription(roles.getDescription());
            listDTO.add(roleDTO);
        }
        return listDTO;
    }
}
