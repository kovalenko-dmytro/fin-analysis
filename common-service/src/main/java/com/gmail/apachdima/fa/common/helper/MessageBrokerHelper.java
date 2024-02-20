package com.gmail.apachdima.fa.common.helper;

public interface MessageBrokerHelper<CTX> {

    CTX init(String identifier);
    void send(CTX context, Object object);
    Object receive(CTX context);
    void clear(CTX context);
}
