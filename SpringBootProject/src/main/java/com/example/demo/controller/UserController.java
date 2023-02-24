package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.payload.LoginRequest;
import com.example.demo.service.Imp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("")
    public ResponseEntity<?> getAllUsers(){
        return new ResponseEntity<>(userService.getALlUsers(), HttpStatus.OK);
    }
    @GetMapping("/getByEmailAndRoleName")
    public ResponseEntity<?> getByEmailAndRoleName(@RequestParam("email") String email, @RequestParam("roleName") String roleName){
        return new ResponseEntity<>(userService.getUserByEmailAndRoleName(email, roleName), HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest){
        return new ResponseEntity<>(userService.login(loginRequest), HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<?> saveUser(@RequestBody UserDTO userDTO){
        return new ResponseEntity<>(userService.isSaved(userDTO), HttpStatus.OK);
    }
}
