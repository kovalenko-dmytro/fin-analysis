package com.gmail.apachdima.fa.user.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.apachdima.fa.common.constant.message.Error;
import com.gmail.apachdima.fa.common.dto.ErrorResponseDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

@Component
@RequiredArgsConstructor
public class AppAuthenticationEntryPoint implements AuthenticationEntryPoint {

    private final MessageSource messageSource;

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e)
        throws IOException {
        String message = messageSource.getMessage(Error.UNAUTHORISED.getKey(), null, Locale.ENGLISH);
        ErrorResponseDTO responseDTO =
            ErrorResponseDTO.builder()
                .status(HttpStatus.UNAUTHORIZED)
                .message(message)
                .errors(List.of(e.getMessage()))
                .timestamp(LocalDateTime.now().toString())
                .build();

        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(responseDTO));
    }
}
