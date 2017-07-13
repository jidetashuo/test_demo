package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.dao.springMapper.UserMapper;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Author 王猛
 * @Date 2017/4/13 16:47
 * @Discribe:测试和mybatis整合
 */
@RestController
public class UserControler {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("user")
    public String testUserMapper(){
        String username=userMapper.findUserByName("admin");
        System.out.println(username);
        return username;
    }

    public static void main(String[] args) {
        List<String> l=new ArrayList<String>();
        Set<String> set=new HashSet<>();
    }


}
