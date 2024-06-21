package com.cristian.chat.chat_springboot.services;

import com.cristian.chat.chat_springboot.persistence.entities.UserEntity;

import java.util.List;

public interface IUserService {
    public List<String> findAllUsernames();
}
