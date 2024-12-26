package com.qiming;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qiming.dao.AppInfoMapper;
import com.qiming.dao.CustomMapper;
import com.qiming.pojo.model.AppInfo;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

public class SpringApplicationTest {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication();
        ApplicationContext context = SpringApplication.ac;
        // 查询所有Bean
        Arrays.stream(SpringApplication.ac.getBeanDefinitionNames()).forEach(System.out::println);
        // 对象返回值查询
        AppInfoMapper appInfoMapper = context.getBean("appInfoMapper", AppInfoMapper.class);
        QueryWrapper<AppInfo> queryWrapper = new QueryWrapper<>();
        Wrapper<AppInfo> select = queryWrapper.select("app_name", "current_server");
        List<AppInfo> appInfos = appInfoMapper.selectList(select);
        // 自定义SQL查询
        appInfos.forEach(System.out::println);
        CustomMapper customMapper = context.getBean("customMapper", CustomMapper.class);
        customMapper.select().forEach(System.out::println);
    }
}
