package com.qiming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Objects;

public class SpringApplication {
    public volatile static ApplicationContext ac = null;

    public SpringApplication() {
        init();
    }

    private void init() {
        if (Objects.isNull(ac)) {
            synchronized (SpringApplication.class) {
                if (Objects.isNull(ac)) {
                    ac = new ClassPathXmlApplicationContext("oms-worker-container-spring-context.xml");
                }
            }
        }
    }
}
