package com.gmail.apachdima.fa.user.service;

import com.gmail.apachdima.fa.common.dto.user.UpdateUserRequestDTO;
import com.gmail.apachdima.fa.common.dto.user.CreateUserRequestDTO;
import com.gmail.apachdima.fa.common.dto.user.UserResponseDTO;
import com.gmail.apachdima.fa.user.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Locale;

public interface UserService {

    Page<UserResponseDTO> findAll(Pageable pageable);
    UserResponseDTO findById(String userId, Locale locale);
    User getByUsername(String name, Locale locale);
    UserResponseDTO update(String userId, UpdateUserRequestDTO request, Locale locale);
    UserResponseDTO create(CreateUserRequestDTO request);
    void delete(String userId, Locale locale);
}
