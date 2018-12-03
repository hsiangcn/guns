package cn.stylefeng.guns.modular.system.service.impl;

import cn.stylefeng.guns.modular.system.dao.ServiceHandlerConfigMapper;
import cn.stylefeng.guns.modular.system.model.ServiceHandlerConfig;
import cn.stylefeng.guns.modular.system.model.ServiceHandlerConfigExample;
import cn.stylefeng.guns.modular.system.service.ServiceHandlerConfigService;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ServiceHandlerConfigServiceImpl
 * @Description TODO
 * @Author hsiangcn@sina.com
 * @Date 2018/11/30 16:58
 * @Version 1.0
 */
@Service
public class ServiceHandlerConfigServiceImpl implements ServiceHandlerConfigService {

    private static final Logger logger = LoggerFactory.getLogger(ServiceHandlerConfigServiceImpl.class);

    @Autowired(required = false)
    private ServiceHandlerConfigMapper serviceHandlerConfigMapper;

    @Override
    public ServiceHandlerConfig queryServiceHandlerConfig(String category, String invoking) {
        ServiceHandlerConfig serviceHandlerConfig = null;
        ServiceHandlerConfigExample example = new ServiceHandlerConfigExample();
        ServiceHandlerConfigExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryEqualTo(category);
        criteria.andInvokingEqualTo(invoking);
        example.setOrderByClause("create_time desc");
        List<ServiceHandlerConfig> configList = serviceHandlerConfigMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(configList)) {
            serviceHandlerConfig = configList.get(0);
        } else {
            logger.info("根据 category：{}; invoking : {} 查询结果为空", category, invoking);
        }
        return serviceHandlerConfig;
    }
}
