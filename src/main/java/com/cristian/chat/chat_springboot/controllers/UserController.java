package com.cristian.chat.chat_springboot.controllers;

import com.cristian.chat.chat_springboot.persistence.entities.UserEntity;
import com.cristian.chat.chat_springboot.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/find-all")
    private ResponseEntity<List<String>> getAllUsers() {
       return new ResponseEntity<>(userService.findAllUsernames(), HttpStatus.OK);
    }

}
