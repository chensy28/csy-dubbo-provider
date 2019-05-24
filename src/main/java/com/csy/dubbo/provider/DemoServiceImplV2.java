package com.csy.dubbo.provider;

/**
 * @author chensy
 * @date 2019-04-29 08:07
 */
public class DemoServiceImplV2 implements DemoServiceV2 {
    public String sayHelloV2(String name) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "providerV2 : " + name;
    }
}
