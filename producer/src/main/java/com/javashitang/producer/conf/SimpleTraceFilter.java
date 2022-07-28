package com.javashitang.producer.conf;

import cn.hutool.core.util.IdUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;
import org.slf4j.MDC;

import static org.apache.dubbo.monitor.MonitorService.PROVIDER;

/**
 * @Author lilimin
 * @Date 2022/7/28
 */
@Slf4j
@Activate(group = PROVIDER)
public class SimpleTraceFilter implements Filter {

    private static final String TRACE_ID = "traceId";

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        log.info("traceFilter");
        MDC.put(TRACE_ID, IdUtil.simpleUUID());
        Result result = invoker.invoke(invocation);
        MDC.remove(TRACE_ID);
        return result;
    }
}
