package test.activeMQ;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * Created by wm on 2017/6/9.
 */
@Configuration
public class ActiveMQConfig {

    @Bean
    public Queue logQueue() {
        return new ActiveMQQueue("wm.mq.queue");
    }

    @Bean
    public Topic topic() {
        return new ActiveMQTopic("wm.mq.topic");
    }

}
