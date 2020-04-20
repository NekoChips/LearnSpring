package com.neko.learn.enable.annotation;

import com.neko.learn.enable.selector.NekoConfigurationSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author NekoChips
 * @description 自定义 @Enable 模块驱动注解
 * @date 2020/4/20
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(NekoConfigurationSelector.class)
public @interface EnableNeko {
    
}