package com.neko.learn.enable.register;

import com.neko.learn.enable.bean.Apple;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author NekoChips
 * @description 自定义 ImportBeanDefinitionRegistrar​ 实现类
 * @date 2020/4/20
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        String beaName = Apple.class.getName();
        boolean exist = registry.containsBeanDefinition(beaName);
        if (exist) {
            System.out.println(String.format("%s 已经存在于注册器中", beaName));
            return;
        }
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(beaName);
        registry.registerBeanDefinition(beaName, rootBeanDefinition);
    }
}
