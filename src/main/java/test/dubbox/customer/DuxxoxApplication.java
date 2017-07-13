package test.dubbox.customer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import test.Init;
import test.dubbox.service.DubboxService;

/**
 * 测试类
 * Created by wm on 2017/6/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Init.class)
public class DuxxoxApplication {


    @Reference
    DubboxService dubboxServiceImpl;


    @Test
    public void contextLoads() {
//        System.out.println(dubboxServiceImpl.doubboxTest());//调用
    }
}
