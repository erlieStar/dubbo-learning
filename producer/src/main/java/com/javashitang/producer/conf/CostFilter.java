package com.javashitang.producer.conf;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Result;
import org.apache.dubbo.rpc.RpcException;

import static org.apache.dubbo.monitor.MonitorService.PROVIDER;

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
