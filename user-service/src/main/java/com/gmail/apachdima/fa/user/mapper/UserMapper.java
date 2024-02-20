package com.gmail.apachdima.fa.user.mapper;

import com.gmail.apachdima.fa.common.dto.user.UserResponseDTO;
import com.gmail.apachdima.fa.user.model.Role;
import com.gmail.apachdima.fa.user.model.User;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.Objects;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UserMapper {

    UserResponseDTO toUserResponseDTO(User user);
    default String roleToString(Role role) {
        return (Objects.isNull(role)) ? null : role.getRole().name();
    }
}
