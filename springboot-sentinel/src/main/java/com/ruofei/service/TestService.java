package com.ruofei.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: srf
 * @Date: 2021/5/14 15:42
 * @description:
 */
@Service
public class TestService {

    @SentinelResource(value = "HelloWorld")
    public String sayHello(String name) {
        return "Hello, " + name;
    }

/*    static {
        List<FlowRule> rules = new ArrayList<>();
        FlowRule rule = new FlowRule();
        rule.setResource("HelloWorld");
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        // Set limit QPS to 20.
        rule.setCount(0);
        rules.add(rule);
        FlowRuleManager.loadRules(rules);
    }*/

}