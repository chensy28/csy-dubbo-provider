package com.csy.dubbo.provider.rpc.module.test;

/**
 * @author chensy
 * @date 2019-05-28 23:26
 */
public class RpcDemoImpl implements RpcDemo {
    @Override
    public String sayHi(String str) {
        return "rpc module " + str;
    }
}
