package com.gmail.apachdima.fa.common.dto.email;

import com.gmail.apachdima.fa.common.constant.email.EmailType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.Map;
import java.util.Set;

@Builder
public record EmailRequestDTO(
    @NotNull
    EmailType emailType,
    @NotBlank
    @Email
    String to,
    Set<String> cc,
    String subject,
    Map<String, Object> properties
) {
}
