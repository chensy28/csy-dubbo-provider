package com.csy.dubbo.provider.xml.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chensy
 * @date 2019-04-29 08:18
 */
public class Provider {
    public int age = 1;
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]
                {"classpath:provider.xml"});
        // src/main/resources/provider.xml  此路径找不到
        /**
         * java同名全局变量和局部变量,局部定义的变量能够覆盖全局范围内的变量,用全局变量的话，会使用this关键字辅助。
         */
//        int age = 9;
//        System.out.println(new Provider().getAge());
        context.start();
        System.in.read();  // 按任意键退出
    }

    public int getAge(){
        return this.age;
    }
}
