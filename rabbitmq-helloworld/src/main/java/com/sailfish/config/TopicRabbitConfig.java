package com.sailfish.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sailfish
 * @create 2017-04-23-上午11:42
 */
@Configuration
public class TopicRabbitConfig {

    @Bean
    public Queue topicAQueue() {
        return new Queue("topic.a");
    }

    @Bean
    public Queue topicAnyQueue() {
        return new Queue("topic.any");
    }

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange("topicExchange");
    }

    @Bean
    public Binding bindingExchangeTopicA(Queue topicAQueue, TopicExchange topicExchange) {
        return BindingBuilder.bind(topicAQueue).to(topicExchange).with("topic.a");
    }

    @Bean
    public Binding bindingExchangeTopicAny(Queue topicAnyQueue, TopicExchange topicExchange) {
        return BindingBuilder.bind(topicAnyQueue).to(topicExchange).with("topic.#");
    }
}
