package cn.stylefeng.guns.web.controller;

import cn.stylefeng.guns.core.util.SendConnectionRequest;
import cn.stylefeng.guns.web.adaptation.CcUserAp;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName Test
 * @Description TODO
 * @Author hsiangcn@sina.com
 * @Date 2018/11/29 12:01
 * @Version 1.0
 */
@Controller
@RequestMapping("/Cclong")
public class Cclong {


    @RequestMapping(value = "/ccsdLongs", method = RequestMethod.GET)
    @ResponseBody
    public String longs() {
        CcUserAp c = new SendConnectionRequest().invokingMethod(
                "User","userinfo", "{\"user_code\": \"1037619709159591936\"}", CcUserAp.class);
        return JSON.toJSONString(c);
    }
}
