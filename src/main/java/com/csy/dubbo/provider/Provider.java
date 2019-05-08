package com.csy.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chensy
 * @date 2019-04-29 08:18
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]
                {"classpath:provider.xml"});
        // src/main/resources/provider.xml  此路径找不到
        context.start();
        System.in.read(); // 按任意键退出
    }
}
