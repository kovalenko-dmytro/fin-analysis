package com.gmail.apachdima.fa.common.constant.mq;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ServiceIdentifier {

    USER_SERVICE("user-service");

    private final String value;
}
