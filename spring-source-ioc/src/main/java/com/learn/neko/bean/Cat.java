package com.learn.neko.bean;

import java.io.Serializable;

/**
 * @author NekoChips
 * @description 宠物
 * @date 2020/4/18
 */
public class Cat implements Serializable {

    private static final long serialVersionUID = -3537231894694469567L;

    private String name;

    private String type;

    public Cat() {
    }

    public Cat(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
