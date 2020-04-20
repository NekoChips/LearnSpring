package com.neko.learn.enable.selector;

import com.neko.learn.enable.bean.Apple;
import com.neko.learn.enable.bean.Cat;
import com.neko.learn.enable.bean.Dog;
import com.neko.learn.enable.bean.Fish;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NekoChips
 * @description 基于 NekoConfig 的 ImportSelector 实现类
 * @date 2020/4/20
 */
public class NekoConfigurationSelector implements ImportSelector {
    
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        List<String> result = new ArrayList<>(4);
        result.add(Apple.class.getName());
        result.add(Cat.class.getName());
        result.add(Dog.class.getName());
        result.add(Fish.class.getName());
        
        return StringUtils.toStringArray(result);
    }
}
