package com.cristian.chat.chat_springboot.services.impl;

import com.cristian.chat.chat_springboot.persistence.entities.UserEntity;
import com.cristian.chat.chat_springboot.persistence.repositories.UserRepository;
import com.cristian.chat.chat_springboot.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<String> findAllUsernames() {
        return userRepository.getAllUsernames();
    }
}
