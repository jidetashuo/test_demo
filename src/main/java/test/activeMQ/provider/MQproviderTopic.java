package test.activeMQ.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

/**
 * Created by wm on 2017/6/9.
 */
@Component
public class MQproviderTopic implements CommandLineRunner {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Topic topic;

    @Override
    public void run(String... strings) throws Exception {
        send("This is a wm's topic  message.");
    }

    public void send(String msg) {
        System.out.println("生产消息topic：" + msg);
        this.jmsMessagingTemplate.convertAndSend(this.topic, msg);
    }
}
