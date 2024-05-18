package com.chatop.backend.service;

import com.chatop.backend.dto.RegistrationRequest;
import com.chatop.backend.dto.UserDTO;
import org.springframework.validation.annotation.Validated;


import java.util.Optional;

@Validated
public interface UserService {
    Optional<UserDTO> getUserById(Integer user_id);
    void registerUser(RegistrationRequest registrationRequest) throws Exception;
}
