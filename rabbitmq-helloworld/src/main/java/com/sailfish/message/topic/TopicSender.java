package com.sailfish.message.topic;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sailfish
 * @create 2017-04-23-上午11:47
 */
@Component
@Slf4j
public class TopicSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    // 发送者A
    public void sendA(String message) {
        rabbitTemplate.convertAndSend("topicExchange", "topic.a", message);
        log.info(String.format("send topic a message: %s", message));
    }

    // 发送者B
    public void sendB(String message) {
        rabbitTemplate.convertAndSend("topicExchange", "topic.b", message);
        log.info(String.format("send topic b message: %s", message));
    }

    // 发送者Any
    public void sendAny(String message) {
        rabbitTemplate.convertAndSend("topicExchange", "topic.any", message);
        log.info(String.format("send topic any message: %s", message));
    }

}
