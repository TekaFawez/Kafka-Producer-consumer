package com.fawez.wikimedia.consumer.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class WikimediaConsumer {


    @KafkaListener(topics = "wikimedia-topic",groupId = "myGroup")

    public void consumeMsg(String message){
        log.info(String.format("Consuming the message from wikimedia-topic %s",message));

    }

}
