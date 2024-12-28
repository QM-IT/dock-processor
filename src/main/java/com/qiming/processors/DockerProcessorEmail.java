package com.qiming.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import tech.powerjob.worker.core.processor.ProcessResult;
import tech.powerjob.worker.core.processor.TaskContext;
import tech.powerjob.worker.core.processor.sdk.BasicProcessor;
import tech.powerjob.worker.log.OmsLogger;

@Component
public class DockerProcessorEmail implements BasicProcessor {

    @Autowired
    ApplicationContext ac;

    @Override
    public ProcessResult process(TaskContext taskContext) {
        OmsLogger logger = taskContext.getOmsLogger();
        logger.info("\n\n/* =====================DockerProcessorStdout===================== */");
        // TODO: 参考spring-Integration-Mail说明文档
        logger.info("/* =====================End===================== */\n\n");
        return new ProcessResult(true);
    }
}
