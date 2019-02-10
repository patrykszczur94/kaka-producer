package com.ratcoding.com.apachekafkaexample.kafka.producer;

import com.ratcoding.com.apachekafkaexample.kafka.dto.Message;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.io.Serializable;


@Component
public class KafkaProducer {

    @Autowired
    KafkaTemplate<String, byte[]> stringStringKafkaTemplate;

    public void sendMessage() {
        Message message = new Message("hello", 1L, 1);
        stringStringKafkaTemplate.send("papryk-topic", 0, System.currentTimeMillis(), "message-key", serialize(message));
    }

    public static byte[] serialize(final Object obj) {
        return SerializationUtils.serialize((Serializable) obj);
    }
}
