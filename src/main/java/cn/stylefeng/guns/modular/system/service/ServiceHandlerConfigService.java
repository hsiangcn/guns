package cn.stylefeng.guns.modular.system.service;

import cn.stylefeng.guns.modular.system.model.ServiceHandlerConfig;

/**
 * @ClassName ServiceHandlerConfigService
 * @Description TODO
 * @Author hsiangcn@sina.com
 * @Date 2018/11/30 16:57
 * @Version 1.0
 */
public interface ServiceHandlerConfigService {

    public ServiceHandlerConfig queryServiceHandlerConfig(String category, String invoking);

}
