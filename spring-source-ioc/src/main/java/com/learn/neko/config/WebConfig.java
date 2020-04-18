package com.learn.neko.config;

import com.learn.neko.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author NekoChips
 * @description Web 配置类
 * @date 2020/4/16
 */

@Configuration
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class WebConfig {

    @Bean(name = "human")
    @Lazy
    public Person person() {
        System.out.println("------ 创建 Person 对象 ------");
        return new Person("NekoChips", 18);
    }
}
