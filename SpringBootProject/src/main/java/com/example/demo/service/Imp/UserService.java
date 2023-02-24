package com.example.demo.service.Imp;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.UsersEntity;
import com.example.demo.payload.LoginRequest;

import java.util.List;

public interface UserService {
    boolean login(LoginRequest loginRequest);
    boolean isSaved(UserDTO userDTO);

    List<UserDTO> getALlUsers();

    List<UserDTO> getUserByEmailAndRoleName(String name, String roleName);
}
