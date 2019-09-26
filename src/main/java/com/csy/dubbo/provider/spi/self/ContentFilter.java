package com.csy.dubbo.provider.spi.self;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;

/**
 * 自定义内容拦截
 * @author chensy
 * @date 2019-09-14 11:29
 */
@Activate(group = Constants.PROVIDER) //@Activate 会自动激活，加了此注解，不需要再XML中配置
public class ContentFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        Result result = invoker.invoke(invocation);
        System.out.println("进入自定义filter");
        return result;
    }
}
