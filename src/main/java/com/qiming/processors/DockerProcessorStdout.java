package com.qiming.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import tech.powerjob.worker.core.processor.ProcessResult;
import tech.powerjob.worker.core.processor.TaskContext;
import tech.powerjob.worker.core.processor.sdk.BasicProcessor;
import tech.powerjob.worker.log.OmsLogger;

import java.util.Arrays;

@Component
public class DockerProcessorStdout implements BasicProcessor {

    @Autowired
    ApplicationContext ac;

    @Override
    public ProcessResult process(TaskContext taskContext) {
        String applicationName = ac.getApplicationName();
        OmsLogger logger = taskContext.getOmsLogger();
        logger.info("\n\n/* =====================DockerProcessorStdout===================== */");
        logger.info(String.format("Dear %s, these are all beanName: \n", applicationName));
        Arrays.stream(ac.getBeanDefinitionNames()).forEach(beanName -> logger.info("\t\t" + beanName));
        logger.info("/* =====================End===================== */\n\n");
        return new ProcessResult(true);
    }
}
