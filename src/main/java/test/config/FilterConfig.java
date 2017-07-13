package test.config;


import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.net.httpserver.AuthFilter;

import javax.servlet.Filter;

/**
 * @Author 王猛
 * @Date 2017/5/4 19:14
 * @Discribe:
 */
@Configuration
public class FilterConfig {




    @Bean
    public FilterRegistrationBean someFilterRegistrationLogout() {

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(logoutFilter());
        registration.addUrlPatterns("/User/user/logout");
        registration.setOrder(2);
        return registration;
    }


    @Bean(name = "logoutFilter")
    public Filter logoutFilter() {
        return new LogoutFilter();
    }



}
