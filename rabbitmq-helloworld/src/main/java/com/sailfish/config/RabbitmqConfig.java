package com.sailfish.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sailfish
 * @create 2017-04-23-上午8:42
 */
@Configuration
public class RabbitmqConfig {

    @Bean
    public Queue ssdQueue(){
        return new Queue("hello");
    }


}
