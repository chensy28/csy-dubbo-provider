package com.csy.dubbo.provider.api.test;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

/**
 * @author chensy
 * @date 2019-05-25 23:18
 */
public class ApiTest3 {
    public static void main(String[] args) throws Exception{
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("csy_dubbo");

        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("127.0.0.1:2181");
        registryConfig.setClient("zkclient");
        registryConfig.setProtocol("zookeeper");

        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20882);

        ApiDemo apiDemo = new ApiDemoImpl();
        ServiceConfig<ApiDemo> serviceConfig = new ServiceConfig<ApiDemo>();
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setProtocol(protocolConfig);
        serviceConfig.setInterface(ApiDemo.class);
        serviceConfig.setRef(apiDemo);
        //serviceConfig.setVersion("1.0.0");

        serviceConfig.export();
        System.in.read();

    }
}
