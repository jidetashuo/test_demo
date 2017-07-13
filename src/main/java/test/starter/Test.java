package test.starter;


import autoconfig.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wm on 2017/6/12.
 */
@RestController
@RequestMapping("/start")
public class Test {

    @Autowired
    private Hello hello;

    @RequestMapping("/hello")
    public String index() {
        return hello.sayHello();
    }
}
