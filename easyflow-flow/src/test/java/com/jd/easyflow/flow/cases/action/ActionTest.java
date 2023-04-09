package com.jd.easyflow.flow.cases.action;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jd.easyflow.flow.engine.FlowParam;
import com.jd.easyflow.flow.engine.FlowResult;
import com.jd.easyflow.flow.engine.impl.FlowEngineImpl;

/**
 * 
 * @author liyuliang5
 *
 */
public class ActionTest {
    
    private static final Logger logger = LoggerFactory.getLogger(ActionTest.class);

    /**
     * Test customize action.
     */
    @Test
    public void testAction001() {
        FlowEngineImpl flowEngine = new FlowEngineImpl();
        flowEngine.setFlowPath("classpath:flow/cases/action/action_test_001.json");
        flowEngine.init();
        
        Map<String, Object> bizParam = new HashMap<>();
        bizParam.put("a", "a1");
        bizParam.put("b", "b1");
        logger.info("请求参数:" + bizParam);
        FlowParam param = new FlowParam("action_test_001", bizParam);
        FlowResult result = flowEngine.execute(param);
        logger.info("响应结果:" + result.getResult());
    }
}