package test.config;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import java.io.IOException;

/**
 * @Author 王猛
 * @Date 2017/5/5 17:52
 * @Discribe:
 */
public abstract class BaseFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void destroy() {
    }


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {


        System.out.println("这是抽象类doFilter");
        if(test()){
            System.out.println("继续往下走");
            chain.doFilter(request,response);
        }
        System.out.println("过滤器结束");
    }

    protected abstract boolean test();
}
