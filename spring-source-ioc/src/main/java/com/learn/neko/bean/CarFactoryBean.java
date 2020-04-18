package com.learn.neko.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author NekoChips
 * @description Car 的 FactoryBean
 * @date 2020/4/17
 */
@Component
public class CarFactoryBean implements FactoryBean<Car> {
    
    @Override
    public Car getObject() throws Exception {
        return new Car("red", 4);
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
