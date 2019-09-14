package com.csy.dubbo.provider.spi.self;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;

/**
 * 自定义内容拦截
 * @author chensy
 * @date 2019-09-14 11:29
 */
@Activate(group = Constants.PROVIDER)
public class ContentFilter implements Filter { //TODO 过滤器已经被夹在，为啥不生效
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        Result result = invoker.invoke(invocation);
        System.out.println("进入自定义filter");
        return result;
    }
}
