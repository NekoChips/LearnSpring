package com.neko.learn.auto.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @author NekoChips
 * @description 自定义自动装配组件
 * @date 2020/4/21
 */
@Configuration
@ConditionalOnProperty(prefix = "spring", name = "demo.auto", havingValue = "true")
public class DemoAutoConfiguration {
    static {
        System.out.println("------ 装配 DemoAutoConfiguration 配置类------");
    }
}
