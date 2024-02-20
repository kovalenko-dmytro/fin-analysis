package com.gmail.apachdima.fa.common.dto;

import lombok.Builder;
import org.springframework.http.HttpStatus;

import java.util.List;

@Builder
public record ErrorResponseDTO(
     HttpStatus status,
     String message,
     List<String> errors,
     String timestamp
) {}
