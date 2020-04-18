package com.learn.neko.filter;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author NekoChips
 * @description 自定义扫描策略
 * @date 2020/4/17
 */
public class MyTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        // 正在被扫描的类的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        // 正在被扫描的类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        // 正在被扫描的类的资源路径信息
        Resource resource = metadataReader.getResource();

        // 该过滤策略为类名中包含 Person 的类
       return classMetadata.getClassName().contains("Person");
    }
}
