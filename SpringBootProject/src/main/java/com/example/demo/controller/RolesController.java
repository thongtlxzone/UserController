package com.example.demo.controller;

import com.example.demo.dto.RoleDTO;
import com.example.demo.entity.RolesEntity;
import com.example.demo.repository.RoleRepository;
import com.example.demo.service.Imp.RoleService;
import com.example.demo.service.RolesServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/role")
public class RolesController {

    @Autowired
    RoleService rolesService;

    @GetMapping("")
    public ResponseEntity<?> getAllRoles(){
        return new ResponseEntity<>(rolesService.getAllRole(), HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<?> getRoleByName(@PathVariable String name){
        return new ResponseEntity<>(rolesService.getRoleByName(name), HttpStatus.OK);
    }
}
