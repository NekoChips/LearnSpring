package com.learn.neko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author NekoChips
 * @description Spring Boot 启动类
 * @date 2020/4/16
 */

@SpringBootApplication
//@ComponentScan(value = "com.learn.neko",
//        excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = WebConfig.class)})
//@ComponentScan(value = "com.learn.neko",
//        includeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = WebConfig.class)},
//        useDefaultFilters = false)
//@ComponentScan(value = "com.learn.neko",
//        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})})
//@ComponentScan(value = "com.learn.neko",
//        excludeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyTypeFilter.class)})
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        // 测试组件是否注册至 Spring 容器
//        System.out.println(String.format("WebConfig: %s", context.containsBean("webConfig")));
//        System.out.println(String.format("Person: %s", context.containsBean("human")));
//        System.out.println(String.format("PersonService: %s", context.containsBean("personService")));
//        System.out.println(String.format("PersonController: %s", context.containsBean("personController")));
        
        // 测试是否单例
//        Object webConfig1 = context.getBean("webConfig");
//        Object webConfig2 = context.getBean("webConfig");
//        System.out.println(String.format("webConfig1 == webConfig2: %s", webConfig1 == webConfig2));

        // 测试懒加载
//        System.out.println("------ 容器创建完毕 ------");
//        System.out.println(context.getBean("human"));

        // 测试 FactoryBean 方式注册组件
//        System.out.println(context.getBean("carFactoryBean"));
//        System.out.println(context.getBean("&carFactoryBean").getClass());
        
        // 测试 @Conditional 注解
//        System.out.println(String.format("PersonMapper exist?  %s", context.containsBean("personMapper")));
        
        // 测试 @ConditionalOnBean 注解
//        System.out.println(String.format("Cat exist?  %s", context.containsBean("cat")));
        
        // 测试 @ConditionalOnMissingBean、 @ConditionalOnMissingClass 注解
//        System.out.println(String.format("Dragon exist?  %s", context.containsBean("dragon")));
        
        // 测试 @ConditionalOnExpression、@ConditionalOnProperty 注解
//        System.out.println(String.format("ServerProperties exist? %s", context.containsBean("serverProperties")));
        
        // 测试 @Import 注解
        System.out.println(String.format("MyConfig exist? %s", context.containsBean("myConfig")));
        System.out.println(String.format("MyConfig exist? %s", context.containsBean("com.learn.neko.config.MyConfig")));
    }
}
