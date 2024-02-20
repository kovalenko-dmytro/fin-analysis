package com.gmail.apachdima.fa.common.context;

import lombok.Builder;
import org.springframework.amqp.core.Binding;

@Builder
public record RabbitMQContext(
    String identifier,
    String queueName,
    String exchangeName,
    Binding binding,
    String routingKey
) {
}
