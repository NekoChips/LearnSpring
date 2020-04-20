package com.neko.learn.enable.config;

import com.neko.learn.enable.register.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author NekoChips
 * @description 配置类
 * @date 2020/4/19
 */
@Configuration
//@Import(value = MyImportSelector.class)
@Import(value = MyImportBeanDefinitionRegistrar.class)
public class WebConfig {
}
