package com.badboy.springbootmqtt.dto;

import lombok.Data;

@Data
public class Message
{
    private String topic;

    private String content;
}
