package com.iluwatar.chain.v4.handler;

public interface GatewayHandler {
    void setNext(GatewayHandler gatewayHandler);

    void service();
}
