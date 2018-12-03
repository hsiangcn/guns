package cn.stylefeng.guns.core.util;

import cn.stylefeng.guns.modular.system.model.ServiceHandlerConfig;
import cn.stylefeng.guns.modular.system.service.ServiceHandlerConfigService;
import com.alibaba.fastjson.JSONObject;
import com.free.code.utils.SpringContextUtils;
import com.free.code.utils.http.HttpClientUtils;
import com.free.code.utils.http.HttpHeaders;
import com.free.code.utils.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @ClassName RequestRestAdoptions
 * @Description TODO
 * @Author hsiangcn@sina.com
 * @Date 2018/11/28 16:46
 * @Version 1.0
 */
public class SendConnectionRequest {

    private static final Logger logger = LoggerFactory.getLogger(SendConnectionRequest.class);

    private ServiceHandlerConfigService serviceHandlerConfigService = SpringContextUtils.getBean(ServiceHandlerConfigService.class);

    /**
     * 功能描述:    调用方法接口
     *
     * @param: [category, invoking, param, clazz]
     * @return: T
     * @auther: user
     * @date: 2018/11/29 11:26
     */
    public <T> T invokingMethod(String category, String invoking, String param, Class<T> clazz) {
        if (StringUtils.isBlank(category) || StringUtils.isBlank(invoking)
            || clazz == null) {
            return null;
        }
        ServiceHandlerConfig config = getServiceHandlerConfig(category, invoking);
        if (config == null) {
            return null;
        }
        String responseDoby = null;
        if (HttpHeaders.METHOD_POST.equalsIgnoreCase(config.getRequestMethod())) {
            if (config.getAsynType() == 0) {
                responseDoby = HttpClientUtils.doPost(config.getRequestUrl(), param);
            } else {
                // 异步调用
                responseDoby = HttpClientUtils.ajaxPost(config.getRequestUrl(), param);
            }
        } else {
            if (config.getAsynType() == 0) {
                responseDoby = HttpClientUtils.doGet(config.getRequestUrl());
            } else {
                // 异步调用
                responseDoby = HttpClientUtils.ajaxGet(config.getRequestUrl());
            }
        }
        return JSONObject.parseObject(responseDoby, clazz);
    }

    /**
     * 功能描述:    调用方法接口
     *
     * @param: [category, invoking, param, clazz]
     * @return: T
     * @auther: user
     * @date: 2018/11/29 11:26
     */
    public <T> T invokingMethod(String category, String invoking, Map<String, String> param, Class<T> clazz) {
        if (StringUtils.isBlank(category) || StringUtils.isBlank(invoking)
                || clazz == null) {
            return null;
        }
        ServiceHandlerConfig config = getServiceHandlerConfig(category, invoking);
        if (config == null) {
            return null;
        }
        String responseDoby = null;
        if (HttpHeaders.METHOD_POST.equalsIgnoreCase(config.getRequestMethod())) {
            if (config.getAsynType() == 0) {
                responseDoby = HttpClientUtils.doPost(config.getRequestUrl(), param);
            } else {
                // 异步调用
                responseDoby = HttpClientUtils.ajaxPost(config.getRequestUrl(), param);
            }
        } else {
            if (config.getAsynType() == 0) {
                responseDoby = HttpClientUtils.doGet(config.getRequestUrl());
            } else {
                // 异步调用
                responseDoby = HttpClientUtils.ajaxGet(config.getRequestUrl());
            }
        }
        return JSONObject.parseObject(responseDoby, clazz);
    }

    private ServiceHandlerConfig getServiceHandlerConfig(String category, String invoking) {
        ServiceHandlerConfig config = serviceHandlerConfigService.queryServiceHandlerConfig(category, invoking);
        if (config == null) {
            return null;
        }
        if (StringUtils.isBlank(config.getRequestMethod())) {
            config.setRequestMethod(HttpHeaders.METHOD_POST);
        }
        return config;
    }

//    public static void main(String[] args) {
//        ServiceHandlerConfig config = new ServiceHandlerConfig();
//        if (StringUtils.isBlank(config.getRequestMethod())) {
//            config.setRequestMethod(HttpHeaders.METHOD_POST);
//        }
//        System.out.println(config.getRequestMethod());
//    }
}
