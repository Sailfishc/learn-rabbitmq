package com.sailfish.message.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sailfish
 * @create 2017-04-23-上午11:34
 */
@Component
@Slf4j
public class FanoutSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String message) {
        rabbitTemplate.convertAndSend("fanoutExchange", "", message);
        log.info(String.format("send fanout message: %s", message));
    }

}
