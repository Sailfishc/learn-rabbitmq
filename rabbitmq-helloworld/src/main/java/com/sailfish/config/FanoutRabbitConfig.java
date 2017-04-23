package com.sailfish.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sailfish
 * @create 2017-04-23-上午11:32
 */
@Configuration
public class FanoutRabbitConfig {

    @Bean
    public Queue fanoutAQueue() {
        return new Queue("fanout.a");
    }

    @Bean
    public Queue fanoutBQueue() {
        return new Queue("fanout.b");
    }

    @Bean
    public Queue fanoutCQueue() {
        return new Queue("fanout.c");
    }

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    public Binding bindingExchangeFanoutA(Queue fanoutAQueue, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(fanoutAQueue).to(fanoutExchange);
    }

    @Bean
    public Binding bindingExchangeFanoutB(Queue fanoutBQueue, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(fanoutBQueue).to(fanoutExchange);
    }

    @Bean
    public Binding bindingExchangeFanoutC(Queue fanoutCQueue, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(fanoutCQueue).to(fanoutExchange);
    }
}
