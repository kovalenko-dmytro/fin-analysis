package com.gmail.apachdima.fa.common.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record UpdateUserRequestDTO (
    String firstName,
    String lastName
) {

}
