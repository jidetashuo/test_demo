package test.exception;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author 王猛
 * @Date 2017/4/13 14:07
 * @Discribe: 异常统一处理
 */
@RestController
@ControllerAdvice
public class GlobalExceptionHandler {


    //ControllerAdvice, 表示 GlobalExceptionHandler 是一个全局的异常处理器.
    //ExceptionHandler(value = BaseException.class): 表示 baseErrorHandler 处理 BaseException 异常和其子异常.

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public Object baseErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        logger.error("---BaseException Handler---Host {} invokes url {} ERROR: {}", req.getRemoteHost(), req.getRequestURL(), e.getMessage());
        return e.getMessage();
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        logger.error("---DefaultException Handler---Host {} invokes url {} ERROR: {}", req.getRemoteHost(), req.getRequestURL(), e.getMessage());
        return e.getMessage();
    }
}
