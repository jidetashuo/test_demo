package test.activeMQ.Customer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by wm on 2017/6/9.
 */

@Component
public class MQcustomer {
    @JmsListener(destination = "wm.mq.queue")
    public void receivedQueue(String msg) {
        System.out.println("消费消息queue：" + msg);
    }
}
