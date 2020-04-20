package com.neko.learn.enable.selector;

import com.neko.learn.enable.bean.Cat;
import com.neko.learn.enable.bean.Dog;
import com.neko.learn.enable.bean.Fish;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author NekoChips
 * @description 自定义 ImportSelector
 * @date 2020/4/19
 */
public class MyImportSelector implements ImportSelector {
    
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {
                Cat.class.getName(),
                Dog.class.getName(),
                Fish.class.getName()
        };
    }
}
