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

//        System.out.println(String.format("WebConfig: %s", context.containsBean("webConfig")));
//        System.out.println(String.format("Person: %s", context.containsBean("human")));
//        System.out.println(String.format("PersonService: %s", context.containsBean("personService")));
//        System.out.println(String.format("PersonController: %s", context.containsBean("personController")));
//
//        Object webConfig1 = context.getBean("webConfig");
//        Object webConfig2 = context.getBean("webConfig");
//        System.out.println(String.format("webConfig1 == webConfig2: %s", webConfig1 == webConfig2));

//        System.out.println("------ 容器创建完毕 ------");
//        System.out.println(context.getBean("human"));

        System.out.println(context.getBean("carFactoryBean"));
        System.out.println(context.getBean("&carFactoryBean").getClass());
    }
}
