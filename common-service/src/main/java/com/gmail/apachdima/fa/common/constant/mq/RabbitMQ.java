package com.gmail.apachdima.fa.common.constant.mq;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum RabbitMQ {

    QUEUE_PREFIX("fap-queue."),
    EXCHANGE_PREFIX("fap-exchange-"),
    ROUTINE_KEY_PREFIX("fap-routing-key-");

    private final String value;
}
