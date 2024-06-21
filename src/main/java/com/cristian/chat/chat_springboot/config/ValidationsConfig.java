package com.cristian.chat.chat_springboot.config;

import com.cristian.chat.chat_springboot.services.models.validations.UserValidations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidationsConfig {

    @Bean
    public UserValidations userValidation() {
        return new UserValidations();
    }
}
