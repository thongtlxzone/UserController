package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.RolesEntity;
import com.example.demo.entity.UsersEntity;
import com.example.demo.payload.LoginRequest;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.Imp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public boolean login(LoginRequest loginRequest) {
        return userRepository.findByEmailAndPassword(loginRequest.getEmail(),loginRequest.getPassword()).size()>0;
    }

    @Override
    public boolean isSaved(UserDTO userDTO) {
        RolesEntity roles = new RolesEntity();
        roles.setId(userDTO.getRollId());

        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setEmail(userDTO.getEmail());
        usersEntity.setPassword(userDTO.getPassword());
        usersEntity.setFullname(userDTO.getFullname());
        usersEntity.setAvatar(userDTO.getAvatar());
        usersEntity.setRoles(roles);
        try {
            userRepository.save(usersEntity);
            return true;
        }catch (Exception ex){
            return false;
        }


    }

    @Override
    public List<UserDTO> getALlUsers() {
        List<UserDTO> list = new ArrayList<>();
        for (UsersEntity user:userRepository.getAllUser()) {
            UserDTO userDTO = new UserDTO();
            userDTO.setEmail(user.getEmail());
            userDTO.setPassword(user.getPassword());
            userDTO.setFullname(user.getFullname());
            userDTO.setAvatar(user.getAvatar());
            list.add(userDTO);
        }
        return list;
    }

    @Override
    public List<UserDTO> getUserByEmailAndRoleName(String name, String roleName) {
        List<UserDTO> list = new ArrayList<>();
        for (UsersEntity user:userRepository.getUserByEmailAndRoleName(name,roleName)) {
            UserDTO userDTO = new UserDTO();
            userDTO.setEmail(user.getEmail());
            userDTO.setPassword(user.getPassword());
            userDTO.setFullname(user.getFullname());
            userDTO.setAvatar(user.getAvatar());
            list.add(userDTO);
        }
        return list;
    }
}
