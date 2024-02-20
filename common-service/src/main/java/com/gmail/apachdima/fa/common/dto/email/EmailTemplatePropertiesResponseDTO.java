package com.gmail.apachdima.fa.common.dto.email;

import com.gmail.apachdima.fa.common.constant.email.EmailType;
import lombok.Builder;

import java.util.Map;
import java.util.Set;

@Builder
public record EmailTemplatePropertiesResponseDTO(
    Map<EmailType, Set<EmailType.EmailTemplateProperty>> emailTemplateProperties
) {
}
