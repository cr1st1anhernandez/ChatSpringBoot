package com.cristian.chat.chat_springboot.services.models.validations;

import com.cristian.chat.chat_springboot.persistence.entities.UserEntity;
import com.cristian.chat.chat_springboot.services.models.dtos.ResponseDTO;

public class UserValidations {

    public ResponseDTO validate(UserEntity user) {
        ResponseDTO response = new ResponseDTO();
        response.setNumOfErrors(0);
        if(user.getUsername() == null || user.getUsername().isEmpty()) {
            response.setNumOfErrors(1);
            response.setMessage("Username is required");
        } else if(user.getUsername().length() < 5) {
            response.setNumOfErrors(1);
            response.setMessage("Username must be at least 5 characters");
        } else if(user.getPassword() == null || user.getPassword().isEmpty()) {
            response.setNumOfErrors(1);
            response.setMessage("Password is required");
        } else if(!user.getPassword().matches("^(?=.*[A-Z])(?=.*[\\W_]).{8,}$")) {
            response.setNumOfErrors(1);
            response.setMessage("Password must be at least 8 characters long, contain at least one uppercase letter, and one special character.");
        }
        return response;
    }
}
