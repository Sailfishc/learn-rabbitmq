package com.sailfish.message.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sailfish
 * @create 2017-04-23-上午11:35
 */
@Component
@Slf4j
public class fanoutReceiveA {


    // 接收者A
    @RabbitListener(queues = "fanout.a")
    public void process(String message) {
        log.info(String.format("receive fanout a message: %s", message));
    }

}
