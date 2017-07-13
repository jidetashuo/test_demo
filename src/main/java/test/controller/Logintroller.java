package test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.bean.ResultData;

/**
 * @Author 王猛
 * @Date 2017/4/28 19:55
 * @Discribe:
 */
@RestController
public class Logintroller {


    @RequestMapping("/login")
    public ResultData login(){
        ResultData data=new ResultData();
        data.setCode("200");
        data.setData("user");
        return data;
    }

}
