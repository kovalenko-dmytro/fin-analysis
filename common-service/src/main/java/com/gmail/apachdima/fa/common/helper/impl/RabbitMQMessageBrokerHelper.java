package com.gmail.apachdima.fa.common.helper.impl;

import com.gmail.apachdima.fa.common.constant.mq.RabbitMQ;
import com.gmail.apachdima.fa.common.context.RabbitMQContext;
import com.gmail.apachdima.fa.common.helper.MessageBrokerHelper;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RabbitMQMessageBrokerHelper implements MessageBrokerHelper<RabbitMQContext> {

    private final AmqpAdmin amqpAdmin;
    private final RabbitTemplate rabbitTemplate;

    @Override
    public RabbitMQContext init(String identifier) {
        String queueName = RabbitMQ.QUEUE_PREFIX.getValue() + identifier;
        String exchangeName = RabbitMQ.EXCHANGE_PREFIX.getValue() + identifier;
        String routingKey = RabbitMQ.ROUTINE_KEY_PREFIX.getValue() + identifier;

        Queue queue = createQueue(queueName);
        TopicExchange exchange = createExchange(exchangeName);
        Binding binding = createBinding(queue, exchange, routingKey);

        return RabbitMQContext.builder()
            .identifier(identifier)
            .queueName(queueName)
            .exchangeName(exchangeName)
            .binding(binding)
            .routingKey(routingKey)
            .build();
    }

    @Override
    public void send(RabbitMQContext context, Object object) {
        rabbitTemplate.convertAndSend(context.exchangeName(), context.routingKey(), object);
    }

    @Override
    public Object receive(RabbitMQContext context) {
        return rabbitTemplate.receiveAndConvert(context.queueName());
    }

    @Override
    public void clear(RabbitMQContext context) {
        amqpAdmin.removeBinding(context.binding());
        amqpAdmin.deleteQueue(context.queueName());
        amqpAdmin.deleteExchange(context.exchangeName());
    }

    private Queue createQueue(String queueName) {
        Queue queue = new Queue(queueName);
        amqpAdmin.declareQueue(queue);
        return queue;
    }

    private TopicExchange createExchange(String exchangeName) {
        TopicExchange exchange = new TopicExchange(exchangeName);
        amqpAdmin.declareExchange(exchange);
        return exchange;
    }

    private Binding createBinding(Queue queue, TopicExchange exchange, String routingKey) {
        Binding binding = BindingBuilder.bind(queue).to(exchange).with(routingKey);
        amqpAdmin.declareBinding(binding);
        return binding;
    }
}
