package com.qiming.processors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qiming.dao.AppInfoMapper;
import com.qiming.pojo.model.AppInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import tech.powerjob.worker.core.processor.ProcessResult;
import tech.powerjob.worker.core.processor.TaskContext;
import tech.powerjob.worker.core.processor.sdk.BasicProcessor;
import tech.powerjob.worker.log.OmsLogger;

import java.util.List;

@Component
public class DockerProcessorSelectDb implements BasicProcessor {

    @Autowired
    ApplicationContext ac;

    @Override
    public ProcessResult process(TaskContext taskContext) {
        String applicationName = ac.getApplicationName();
        OmsLogger logger = taskContext.getOmsLogger();
        logger.info("\n\n/* =====================DockerProcessorSelectDb===================== */");
        logger.info(String.format("Dear %s, this is select sql execution result: \n", applicationName));
        AppInfoMapper appInfoMapper = ac.getBean(AppInfoMapper.class);
        QueryWrapper<AppInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("app_name", "current_server", "title");
        List<AppInfo> appInfos = appInfoMapper.selectList(queryWrapper);
        appInfos.forEach(appInfo -> logger.info("\t" + appInfo));
        logger.info("/* =====================End===================== */\n\n");
        return new ProcessResult(true);
    }
}
