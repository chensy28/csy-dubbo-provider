package com.csy.dubbo.provider.api.test;

/**
 * @author chensy
 * @date 2019-05-25 23:19
 */
public class ApiDemoImpl implements ApiDemo {
    public String sayHello(String str) {
        System.out.println("来自消费者信息：" + str);
        return "provider：" + str;
    }
}
