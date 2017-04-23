package com.sailfish;

import com.sailfish.message.Sender;
import com.sailfish.message.fanout.FanoutSender;
import com.sailfish.message.topic.TopicSender;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author sailfish
 * @create 2017-04-23-上午8:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MQTest {

    @Autowired
    private Sender sender;

    @Autowired
    private FanoutSender fanoutSender;

    @Autowired
    private TopicSender topicSender;

    @Test
    public void testSender(){
        sender.send("ssd queue");
    }

    @Test
    public void fanoutTest(){
        fanoutSender.send("email");
    }

    @Test
    public void topicTest(){
//        topicSender.sendA("topic.a");
        topicSender.sendB("topic.b");
//        topicSender.sendAny("topic.any");
    }
}
