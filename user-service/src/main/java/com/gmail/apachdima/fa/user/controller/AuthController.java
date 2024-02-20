package com.gmail.apachdima.fa.user.controller;

import com.gmail.apachdima.fa.user.service.AuthService;
import com.gmail.apachdima.fa.common.dto.auth.SignInRequestDTO;
import com.gmail.apachdima.fa.common.dto.auth.SignInResponseDTO;
import com.gmail.apachdima.fa.common.dto.user.UserResponseDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Tag(name = "Authentication REST API")
@RestController
@RequestMapping(value = "/api/v1/auth")
@RequiredArgsConstructor
@Slf4j
public class AuthController {

    private final AuthService authService;

    @PostMapping(value = "/sign-in")
    public ResponseEntity<SignInResponseDTO> signIn(
        @Valid @RequestBody SignInRequestDTO request,
        @RequestParam(value = "locale", required = false, defaultValue = "en") Locale locale
    ) {
        return ResponseEntity.ok().body(authService.signIn(request, locale));
    }

    @GetMapping(value = "/current-user")
    public ResponseEntity<UserResponseDTO> getCurrentUser(
        @RequestParam(value = "locale", required = false, defaultValue = "en") Locale locale
    ) {
        return ResponseEntity.ok().body(authService.getCurrentUser(locale));
    }

    @GetMapping(value = "/sign-out")
    public ResponseEntity<?> signOut(HttpServletRequest request) {
        authService.signOut(request);
        return ResponseEntity.ok().build();
    }
}
