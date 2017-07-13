package test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author 王猛
 * @Date 2017/4/10 10:17
 * @Discribe:
 */
@ServletComponentScan
@RestController
@EnableTransactionManagement
@SpringBootApplication
@ComponentScan
@EnableScheduling
public class Init {


    @Value("${book.name}")
    public String name;
    @Value("${book.author}")
    public String author;

    @RequestMapping("/")
    public String index(HttpServletResponse response) {

        Cookie theUsername = new Cookie("token", "loginToken"); //key:username   value:uservalue


        // theUsername.setMaxAge(60*60*24*365);//设置时间：单位是秒60*60*24*365=1年，如果不设置时间我记得是管浏览器就失效了


        response.addCookie(theUsername);


        return "测试一下";
    }


    public static void main(String[] args) {
        SpringApplication.run(Init.class, args);


    }
}
