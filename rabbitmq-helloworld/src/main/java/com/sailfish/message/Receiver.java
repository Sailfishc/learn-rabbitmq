package com.sailfish.message;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sailfish
 * @create 2017-04-23-上午8:47
 */
@Component
@Slf4j
public class Receiver {

    @RabbitListener(queues = "hello")
//    @RabbitHandler
    public void receive(String message){
        log.info(String.format("receive message: %s", message));
    }

}
