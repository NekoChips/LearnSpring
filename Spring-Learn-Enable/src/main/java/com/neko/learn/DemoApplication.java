package com.neko.learn;

import com.neko.learn.enable.config.NekoConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author NekoChips
 * @description 项目启动类
 * @date 2020/4/19
 */
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        // 测试 ImportSelector、 ImportBeanDefinitionRegistrar 组件注册
//        ApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        Arrays.stream(beanDefinitionNames)
//                .forEach(System.out::println);


        // 测试 @EnableCaching 模块驱动
//        ApplicationContext context = new AnnotationConfigApplicationContext(CacheConfig.class);
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        Arrays.stream(beanDefinitionNames)
//                .filter(beanNames -> beanNames.contains("cache"))
//                .forEach(System.out::println);

        // 测试自定义的 @EnableNeko 注解
        ApplicationContext context = new AnnotationConfigApplicationContext(NekoConfig.class);
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
//
//        System.out.println(((CacheInterceptor)(context.getBean("cacheInterceptor"))).getKeyGenerator());
//        System.out.println(((CacheInterceptor)(context.getBean("cacheInterceptor"))).getCacheResolver());
//        System.out.println(((CacheInterceptor)(context.getBean("cacheInterceptor"))).getErrorHandler());
    }
}
