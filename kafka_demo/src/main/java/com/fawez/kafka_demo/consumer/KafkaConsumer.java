package com.fawez.kafka_demo.consumer;

import com.fawez.kafka_demo.payload.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaConsumer {

//@KafkaListener(topics = "fawez",groupId = "myGroup")
public void consumeMsg(String message){
        log.info(String.format("consuming the msg from fawez topic :%s",message));

    }
    @KafkaListener(topics = "fawez",groupId = "myGroup")
    public void consumeJsonMsg(Student student){
        log.info(String.format("consuming the msg from fawez topic :%s",student.toString()));

    }
}
