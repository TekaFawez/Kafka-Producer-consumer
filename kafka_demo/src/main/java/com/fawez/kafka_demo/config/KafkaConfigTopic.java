package com.fawez.kafka_demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfigTopic {
    @Bean
    public NewTopic fawezTopic(){
        return TopicBuilder
                .name("fawez")
                .build();
    }
}
