package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 王猛
 * @Date 2017/4/11 15:33
 * @Discribe: 测试properties文件读取
 */
@RestController
public class ProFileTest {
    @Autowired
    private Environment env;

    /**
     * 测试properties文件读取
     *
     * @return
     */
    @RequestMapping("/proFileTest")
    public String test() {
        return env.getProperty("server.port");
    }


}
