package com.csy.dubbo.provider.rpc.module.test;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.alibaba.dubbo.rpc.RpcContext;

/**
 * 提供者
 * @author chensy
 * @date 2019-05-28 23:28
 */
public class RpcProvider {
    public static void main(String[] args) throws Exception {
        ApplicationConfig application = new ApplicationConfig();
        application.setName("rpc_module");

        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("localhost:2181");
        registry.setProtocol("zookeeper");

        ProtocolConfig protocol = new ProtocolConfig();
        protocol.setName("dubbo");
        protocol.setPort(20880);

        RpcDemo rpcDemo = new RpcDemoImpl();
        ServiceConfig service = new ServiceConfig();
        service.setApplication(application);
        service.setRegistry(registry);
        service.setProtocol(protocol);
        service.setRef(rpcDemo);
        service.setInterface(RpcDemo.class);

        service.export();

        System.in.read();
    }
}
