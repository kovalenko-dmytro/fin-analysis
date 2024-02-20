package com.gmail.apachdima.fa.notification.email.service;

import com.gmail.apachdima.fa.common.dto.email.EmailRequestDTO;
import com.gmail.apachdima.fa.common.dto.email.EmailResponseDTO;
import com.gmail.apachdima.fa.common.dto.email.EmailTemplatePropertiesResponseDTO;
import org.springframework.web.multipart.MultipartFile;

import java.util.Locale;

public interface EmailService {
    EmailTemplatePropertiesResponseDTO getEmailTemplateProperties();
    EmailResponseDTO send(EmailRequestDTO request, MultipartFile[] attachment, Locale locale);
}
