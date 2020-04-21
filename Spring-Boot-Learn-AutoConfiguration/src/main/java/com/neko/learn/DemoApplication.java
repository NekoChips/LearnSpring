package com.neko.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * @author NekoChips
 * @description 启动类
 * @date 2020/4/20
 */
@EnableAutoConfiguration
public class DemoApplication {
    public static void main(String[] args) {
        // 测试 DeferredImportSelector 的执行顺序
//        ApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);

        SpringApplication.run(DemoApplication.class, args);
    }
}
