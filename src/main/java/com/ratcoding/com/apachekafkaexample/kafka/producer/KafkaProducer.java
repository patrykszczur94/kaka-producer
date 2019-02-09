package com.ratcoding.com.apachekafkaexample.kafka.producer;

import com.ratcoding.com.apachekafkaexample.kafka.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    @Autowired
    KafkaTemplate<String, Message> stringStringKafkaTemplate;

    public void sendMessage() {
        Message message = new Message("hello", 1L, 1);
        stringStringKafkaTemplate.send("papryk-topic", "message-key", message);
    }
}
