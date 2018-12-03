package cn.stylefeng.guns.modular.system.dao;

import cn.stylefeng.guns.modular.system.model.ServiceHandlerConfig;
import cn.stylefeng.guns.modular.system.model.ServiceHandlerConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceHandlerConfigMapper {
    int countByExample(ServiceHandlerConfigExample example);

    int deleteByExample(ServiceHandlerConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceHandlerConfig record);

    int insertSelective(ServiceHandlerConfig record);

    List<ServiceHandlerConfig> selectByExample(ServiceHandlerConfigExample example);

    ServiceHandlerConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServiceHandlerConfig record, @Param("example") ServiceHandlerConfigExample example);

    int updateByExample(@Param("record") ServiceHandlerConfig record, @Param("example") ServiceHandlerConfigExample example);

    int updateByPrimaryKeySelective(ServiceHandlerConfig record);

    int updateByPrimaryKey(ServiceHandlerConfig record);
}