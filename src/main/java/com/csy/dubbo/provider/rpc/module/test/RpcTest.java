package com.csy.dubbo.provider.rpc.module.test;

/**
 * @author chensy
 * @date 2019-05-29 00:06
 */
public class RpcTest {
    private Class<?> interfaceClass;
    // 接口实现类引用
    private Object ref;
    public static void main(String[] args) {
        RpcTest rpcTest = new RpcTest();
        rpcTest.interfaceClass = com.csy.dubbo.provider.rpc.module.test.RpcDemo.class;
        //rpcTest.ref =  com.csy.dubbo.provider.rpc.module.test.RpcDemoImpl.class;
        RpcDemo demo = new com.csy.dubbo.provider.rpc.module.test.RpcDemoImpl();
       // rpcTest.ref = new com.csy.dubbo.provider.rpc.module.test.RpcDemoImpl();
        rpcTest.ref = demo;
        rpcTest.checkRef();
    }

    /**
     * 引用测试
     */
    public void checkRef() {
        if (ref == null) {
            throw new IllegalStateException("ref not allow null!");
        }
        // 判断对象是否是指定类的实例
        if (!interfaceClass.isInstance(ref)) {/**@c 检查引用是否是声明接口的实现 */
            throw new IllegalStateException("检查aa引用不为空 The class "
                    + ref.getClass().getName() + " unimplemented interface "
                    + interfaceClass + "!");
        }
    }
}
