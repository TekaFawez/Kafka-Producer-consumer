package com.fawez.kafka_demo.rest;

import com.fawez.kafka_demo.payload.Student;
import com.fawez.kafka_demo.producer.KafkaJsonProducer;
import com.fawez.kafka_demo.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor

public class MessageController {
    private final KafkaProducer kafkaProducer;
    private final KafkaJsonProducer kafkaJsonProducer;


    @PostMapping
    public ResponseEntity<String> sendMessage(
            @RequestBody String msg
            ) {
        kafkaProducer.sendMessage(msg);
        return ResponseEntity.ok("message queued successfully");
    }
    @PostMapping("/json")
    public ResponseEntity<String> sendJsonMessage(
            @RequestBody Student msg
    ) {
        kafkaJsonProducer.sendMessage(msg);
        return ResponseEntity.ok("message queued successfully as Json");
    }
}
