package com.gmail.apachdima.fa.notification.email.mapper;

import com.gmail.apachdima.fa.common.dto.email.EmailResponseDTO;
import com.gmail.apachdima.fa.notification.email.model.EmailLog;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface EmailMapper {

    EmailResponseDTO toEmailResponseDTO(EmailLog emailLog);
}
