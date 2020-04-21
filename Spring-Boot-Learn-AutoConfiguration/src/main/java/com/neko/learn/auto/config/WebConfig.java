package com.neko.learn.auto.config;

import org.springframework.context.annotation.Configuration;

/**
 * @author NekoChips
 * @description web config
 * @date 2020/4/20
 */
@Configuration
//@Import({MyFirstDeferredImportSelector.class, MySecondDeferredImportSelector.class, MyThirdDeferredImportSelector.class})
public class WebConfig {
    static {
        System.out.println("------ 装配 WebConfig 配置类 ------");
    }
}
