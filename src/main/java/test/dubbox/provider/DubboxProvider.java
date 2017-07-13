package test.dubbox.provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wm on 2017/6/7.
 */
public class DubboxProvider {
    void start() {
        String configLocation = "classpath:/applicationDubbox.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(
                configLocation);

    }

    public static void main(String[] args) {

    }
}
