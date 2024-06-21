package com.cristian.chat.chat_springboot.services;

import com.cristian.chat.chat_springboot.persistence.entities.UserEntity;
import com.cristian.chat.chat_springboot.services.models.dtos.LoginDTO;
import com.cristian.chat.chat_springboot.services.models.dtos.ResponseDTO;

import java.util.HashMap;

public interface IAuthService {

    public HashMap<String , String> login(LoginDTO login) throws Exception;

    public ResponseDTO register(UserEntity user) throws Exception;
}
