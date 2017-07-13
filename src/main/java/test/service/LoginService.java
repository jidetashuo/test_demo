package test.service;

import org.springframework.stereotype.Service;
import test.bean.ResultData;
import test.exception.Myexception1;

/**
 * @Author 王猛
 * @Date 2017/5/1 11:01
 * @Discribe:
 */
@Service
public class LoginService {

    public ResultData login(){
        ResultData data = new ResultData();
        data.setCode("401");
        data.setData("user");
        data.setToken(null);



        return data;
    }

}
