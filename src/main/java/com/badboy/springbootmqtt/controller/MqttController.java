package com.badboy.springbootmqtt.controller;

import com.badboy.springbootmqtt.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqttController
{

    @Autowired
    MqttService mqttService;

    @PostMapping("/sendMessage")
    public ResponseEntity publish(@RequestBody Message mqttMessage){
        try {
            mqttService.sentMessage(mqttMessage.getContent(),mqttMessage.getTopic());

            return ResponseEntity.ok("success");
        }
        catch ( Exception exception )
        {
            exception.printStackTrace();
            return ResponseEntity.ok("fail");
        }

    }
}
