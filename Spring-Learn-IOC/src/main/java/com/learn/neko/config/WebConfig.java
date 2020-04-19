package com.learn.neko.config;

import com.learn.neko.bean.Cat;
import com.learn.neko.bean.Dragon;
import com.learn.neko.bean.Person;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

/**
 * @author NekoChips
 * @description Web 配置类
 * @date 2020/4/16
 */

@Configuration
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Import({MyConfig.class})
public class WebConfig {

    @Bean(name = "human")
    @Lazy
    public Person person() {
        System.out.println("------ 创建 Person 对象 ------");
        return new Person("NekoChips", 18);
    }

    @Bean
//    @ConditionalOnBean(value = Person.class)
//    @ConditionalOnBean(name = "human")
    @ConditionalOnClass(name = "com.learn.neko.bean.Person")
//    @ConditionalOnClass(value = Person.class)
    public Cat cat() {
        return new Cat("small cat", "chinese cat");
    }

    @Bean
//    @ConditionalOnMissingBean(value = Person.class)
    @ConditionalOnMissingClass(value = "com.learn.neko.bean.Person")
    public Dragon dragon() {
        return new Dragon("Tyrannosaurus Rex", 70);
    }
}
