package test.activeMQ.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * Created by wm on 2017/6/9.
 */
@Component
public class MQprovider implements CommandLineRunner {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue logQueue;

    @Override
    public void run(String... strings) throws Exception {
        send("This is a wm's  queue  message.");
    }

    public void send(String msg) {
        System.out.println("生产消息queue：" + msg);
        this.jmsMessagingTemplate.convertAndSend(this.logQueue, msg);
    }
}
