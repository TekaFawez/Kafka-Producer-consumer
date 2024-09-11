package com.fawez.kafka_demo.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {
    private final KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String msg){
        log.info(format("sending msg to fawez topic :: %s",msg));
        kafkaTemplate.send("fawez",msg);//fawez is the topic i create

    }
}
