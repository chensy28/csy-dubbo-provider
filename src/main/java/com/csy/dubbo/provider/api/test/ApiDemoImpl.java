package com.csy.dubbo.provider.api.test;

/**
 * @author chensy
 * @date 2019-05-25 23:19
 */
public class ApiDemoImpl implements ApiDemo {
    public String sayHello(String str) {
        return "provider" + str;
    }
}
