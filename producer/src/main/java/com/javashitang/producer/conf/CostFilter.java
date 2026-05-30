package com.javashitang.producer.conf;

import lombok.extern.slf4j.Slf4j;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;

import static com.alibaba.dubbo.monitor.MonitorService.PROVIDER;

/**
 * @author lilimin
 * @since 2020-10-12
 */
@Slf4j
@Activate(group = PROVIDER)
public class CostFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        long start = System.currentTimeMillis();
        Result result = invoker.invoke(invocation);
        long cost = System.currentTimeMillis() - start;
        log.info("request cost " + invoker.getInterface().toString() + " " + invocation.getMethodName() + " " + cost);
        return result;
    }
}
