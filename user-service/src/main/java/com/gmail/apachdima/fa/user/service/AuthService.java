package com.gmail.apachdima.fa.user.service;

import com.gmail.apachdima.fa.common.dto.auth.SignInRequestDTO;
import com.gmail.apachdima.fa.common.dto.auth.SignInResponseDTO;
import com.gmail.apachdima.fa.common.dto.user.UserResponseDTO;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Locale;

public interface AuthService {

    SignInResponseDTO signIn(SignInRequestDTO signInRequestDTO, Locale locale);
    UserResponseDTO getCurrentUser(Locale locale);
    void signOut(HttpServletRequest request);
}
