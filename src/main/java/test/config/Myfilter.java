package test.config;

import test.exception.BaseException;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.nio.file.Path;

/**
 * @Author 王猛
 * @Date 2017/4/28 14:31
 * @Discribe:
 */
public  class Myfilter extends BaseFilter {



    @Override
    protected boolean test() {
        System.out.println("这是子类登录filter....");
        return false;
    }
}
