package com.sailfish.message.topic;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sailfish
 * @create 2017-04-23-上午11:49
 */
@Component
@Slf4j
public class Recv {

    // 接收者A
    @RabbitListener(queues = "topic.a")
    public void processA(String message) {
        log.info(String.format("receive topic a message: %s", message));
    }

    // 接收者Any
    @RabbitListener(queues = "topic.any")
    public void processAny(String message) {
        log.info(String.format("receive topic any message: %s", message));
    }
}
