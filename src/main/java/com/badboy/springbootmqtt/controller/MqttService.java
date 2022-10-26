package com.badboy.springbootmqtt.controller;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.handler.annotation.Header;

@MessagingGateway(defaultRequestChannel = "mqttOutboundChannel")
public interface MqttService
{
    void sentMessage(String data, @Header(MqttHeaders.TOPIC) String topic);
}
