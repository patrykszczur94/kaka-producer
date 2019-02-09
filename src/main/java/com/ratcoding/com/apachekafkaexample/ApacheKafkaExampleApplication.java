package com.ratcoding.com.apachekafkaexample;

import com.ratcoding.com.apachekafkaexample.kafka.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApacheKafkaExampleApplication implements CommandLineRunner {

    @Autowired
    KafkaProducer kafkaProducer;

    public static void main(String[] args) {
        SpringApplication.run(ApacheKafkaExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        kafkaProducer.sendMessage();
    }
}

