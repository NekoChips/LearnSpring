package com.neko.learn.auto.selector;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.annotation.Order;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author NekoChips
 * @description 自定义 DeferredImportSelector
 * @date 2020/4/21
 */
@Order(100)
public class MyFirstDeferredImportSelector implements DeferredImportSelector {
    
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("------ 导入 MyFirstDeferredImportSelector 中包含的组件 ------");
        return new String[0];
    }
}
