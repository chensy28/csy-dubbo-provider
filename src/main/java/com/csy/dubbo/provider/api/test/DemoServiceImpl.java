package com.csy.dubbo.provider.api.test;

import com.alibaba.dubbo.demo.DemoService;

/**
 * @author chensy
 * @date 2019-09-06 14:00
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        System.out.println("provider_demo_sayHello");
        return "provider_demo_" + name;
    }

    @Override
    public String sayLang(String who, String lang, Integer time) {
        System.out.println("provider_demo_sayLang");
        return "who" + who + ",lang=" + lang + ",time=" + time;
    }
}
