package com.gmail.apachdima.fa.common.constant.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CommonConstant {

    MESSAGE_SOURCE_PATH("classpath:messages/messages"),
    EMAIL_PROPERTIES_SOURCE_PATH("classpath:email-properties/email_properties"),
    EMAIL_TEMPLATES_PATH("/email-templates/"),
    AUTH_HEADER("Authorization"),
    BASIC_AUTH_HEADER_PREFIX("Basic "),
    BEARER_AUTH_HEADER_PREFIX("Bearer "),
    COLON(":"),
    DOT("."),
    DASH("-"),
    EQUAL("="),
    COMMA(","),
    SPACE(" "),
    SLASH("/"),
    EMPTY(""),
    CARRIAGE_RETURN("\r\n"),
    EMAIL_TEMPLATE_SUFFIX(".html"),
    DEFAULT_CHARSET("UTF-8");

    private final String value;
}
