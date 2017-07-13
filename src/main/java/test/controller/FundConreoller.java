package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.dao.fundMapper.FundMapper;

/**
 * @Author 王猛
 * @Date 2017/4/18 14:24
 * @Discribe:
 */
@RestController
public class FundConreoller {

    @Autowired
    private FundMapper fundMapper;

    @RequestMapping("fund")
    public String fundUserMapper() {
        String username = fundMapper.getName("00384ba7814d491aa63f58db4fd685ff");
        System.out.println(username);
        return username;
    }
}
