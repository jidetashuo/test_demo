package test.activeMQ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.activeMQ.provider.MQprovider;
import test.activeMQ.provider.MQproviderTopic;

/**
 * Created by wm on 2017/6/9.
 */
@RestController
@RequestMapping("/mq")
public class MQtest {

    @Autowired
    private MQprovider mQprovider;


    @Autowired
    private MQproviderTopic mQproviderTopic;




    @RequestMapping("/queue")
    public String test() {
        mQprovider.send("测试发送消息queue。。。");

        return "mq 消息发送成功queue";
    }

    @RequestMapping("/topic")
    public String topic() {
        mQproviderTopic.send("测试发送消息topic。。。");

        return "mq 消息发送成功topic";
    }

}
