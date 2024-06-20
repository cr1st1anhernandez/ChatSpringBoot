package com.cristian.chat.chat_springboot.services.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseDTO {
    private Integer numOfErrors;
    private String message;
}
