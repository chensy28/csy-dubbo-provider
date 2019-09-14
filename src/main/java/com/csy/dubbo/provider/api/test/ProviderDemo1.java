package com.csy.dubbo.provider.api.test;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.alibaba.dubbo.demo.DemoService;

/**
 * @author chensy
 * @date 2019-05-25 23:18
 */
public class ProviderDemo1 {
    public static void main(String[] args) throws Exception{
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("demo-provider");

        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("127.0.0.1:2181");
        registryConfig.setClient("zkclient");
        registryConfig.setProtocol("zookeeper");

        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20887);

        DemoService apiDemoImpl = new DemoServiceImpl();
        ServiceConfig<DemoService> serviceConfig = new ServiceConfig<DemoService>();
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setProtocol(protocolConfig);
        serviceConfig.setInterface(DemoService.class);
        serviceConfig.setRef(apiDemoImpl);
        //serviceConfig.setVersion("1.0.0");

        serviceConfig.export();
        System.in.read();

    }
}
