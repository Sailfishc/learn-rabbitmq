package com.sailfish.message;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sailfish
 * @create 2017-04-23-上午8:44
 */
@Component
@Slf4j
public class Sender {


    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String message){
        rabbitTemplate.convertAndSend("hello", message);
        log.info(String.format("send message: %s", message));
    }

}
