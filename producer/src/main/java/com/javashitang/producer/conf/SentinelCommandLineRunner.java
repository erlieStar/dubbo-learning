package com.javashitang.producer.conf;

import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.assertj.core.util.Lists;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author lilimin
 * @Date 2022/7/31
 */
@Component
public class SentinelCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        List<FlowRule> flowRules = Lists.newArrayList();
        FlowRule flowRule = new FlowRule();
        flowRule.setResource("com.javashitang.api.service.UserService:hello(java.lang.String)");
        flowRule.setCount(1);
        flowRules.add(flowRule);
        FlowRuleManager.loadRules(flowRules);
    }
}
