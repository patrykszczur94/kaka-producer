package com.ratcoding.com.apachekafkaexample.kafka.dto;

import java.io.Serializable;

public class Message implements Serializable {

    private String topic;
    private Long value;
    private Integer integerValue;

    public Message(String topic, Long value, Integer integerValue) {
        this.topic = topic;
        this.value = value;
        this.integerValue = integerValue;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Integer getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }
}
