package com.qiming;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.io.File;

public class CodeAutoGenerator {
    public static void main(String[] args) {
        // 使用 FastAutoGenerator 快速配置代码生成器
        FastAutoGenerator.create("jdbc:mysql://192.168.100.101:3306/powerjob_product?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai", "qm", "wangqiming")
                .globalConfig(builder -> {
                    builder.author("Wang QiMing") // 设置作者
                            .outputDir("src/test/java".replace("/", File.separator)); // 输出目录
                })
                .packageConfig(builder -> {
                    builder//.parent("com.qiming.mappers") // 设置父包名
                            .entity("model") // 设置实体类包名
                            .mapper("dao") // 设置 Mapper 接口包名
                            .service("service") // 设置 Service 接口包名
                            .serviceImpl("service.impl") // 设置 Service 实现类包名
                            .xml("mappers"); // 设置 Mapper XML 文件包名
                })
                .strategyConfig(builder -> {
                    builder.addInclude(".*") // 设置需要生成的表名
                            .entityBuilder()
                            .enableLombok() // 启用 Lombok
                            .enableTableFieldAnnotation(); // 启用字段注解
//                            .controllerBuilder();
//                            .enableRestStyle(); // 启用 REST 风格
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用 Freemarker 模板引擎
                .execute(); // 执行生成
    }
}
