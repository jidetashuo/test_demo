package test.controller;


import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 王猛
 * @Date 2017/4/11 15:47
 * @Discribe:
 */
@RestController
public class LoggerTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ApiOperation(value = "这是测试日志工作的接口",notes = "这是测试日志工作的接口")
    @RequestMapping(value = "logTest",method = RequestMethod.GET)
    public Object writeLog()
    {


        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        return "OK";
    }
}
