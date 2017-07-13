package test.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.exception.BaseException;
import test.exception.Myexception1;
import test.exception.Myexception2;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author 王猛
 * @Date 2017/4/13 13:54
 * @Discribe:
 */
@RestController
public class ExceptionController {

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/ex_base")
    public Object throwBaseException() throws Exception {
        throw new BaseException("This is BaseException.");
    }

    @RequestMapping("/ex1")
    public Object throwMyException1() throws Exception {

        throw new Myexception1("This is MyException1.");
    }

    @RequestMapping("/ex2")
    public Object throwMyException2() throws Exception {
        throw new Myexception2("This is MyException2.");
    }

    @RequestMapping("/ex_io")
    public Object throwIOException() throws Exception {
        throw new IOException("This is IOException.");
    }

    @RequestMapping("/ex5")
    public Object throwNullPointerException() throws Exception {
        throw new NullPointerException("This is NullPointerException.");
    }

    @ExceptionHandler(NullPointerException.class)
    public String controllerExceptionHandler(HttpServletRequest req, Exception e) {
        logger.error("---ControllerException Handler---Host {} invokes url {} ERROR: {}", req.getRemoteHost(), req.getRequestURL(), e.getMessage());
        return e.getMessage();
    }
}
