package test.dubbox.customer;


import com.alibaba.dubbo.config.annotation.Reference;
import com.rrs.rd.address.api.AddressSearchService;
import com.rrs.rd.address.api.ConvertIDcardService;
import com.rrs.rd.address.api.ConvertPhoneService;
import com.rrs.rd.address.domain.response.AddressModel;
import com.rrs.rd.address.domain.response.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wm on 2017/6/7.
 */
@RestController
@RequestMapping("/dubbox/customer")
public class DubboxCustomer {

//    @Reference
//    AddressSearchService addressSearchService;


    @Reference
    ConvertPhoneService  convertPhoneService;

    @Reference
    ConvertIDcardService convertIDcardService;

//    @Reference(version="1.0.0")
//    AddressSearchService addressSearchService;


//    @RequestMapping("/test")
//    public String contextLoads() {
//        return dubboxServiceImpl.doubboxTest();//调用
//    }

    @RequestMapping("/demo")
    public Result test() {

        System.out.println("33");
//        System.out.println(httpDemoServiceImpl.get("大连市", 5));
//        return httpDemoServiceImpl.get("大连市", 5);//调用


//        addressModel = addressSearchService.queryAddress(addressModel);

//
//        System.out.println(addressModel.getAddressModel().getAddressText());
        String phone = "+85611００kdla86667705118*)++(^%*YTILK++H89015jfkhka１１２３()  (   ) - _ ++";
        System.out.println(convertPhoneService.convertPhone(phone));

        return  convertIDcardService.convertIDcard("2111212x");

    }
}
