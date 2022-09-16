package com.iluwatar.chain.v4;

import com.iluwatar.chain.v4.handler.GatewayHandler;

public class GetewayClient {
    public static void main(String[] args) {
        GatewayHandler firstGatewayHandler = GatewayHandlerEnumFactory.getFirstGatewayHandler();
        firstGatewayHandler.service();
    }
}
