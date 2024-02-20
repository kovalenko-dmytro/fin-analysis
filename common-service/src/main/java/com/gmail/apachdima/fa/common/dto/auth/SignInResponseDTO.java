package com.gmail.apachdima.fa.common.dto.auth;

import lombok.Builder;

@Builder
public record SignInResponseDTO (
    String tokenType,
    String accessToken,
    long accessTokenExpired
) {}
