package com.learn.neko.bean;

import java.io.Serializable;

/**
 * @author NekoChips
 * @description 龙
 * @date 2020/4/18
 */
public class Dragon implements Serializable {

    private static final long serialVersionUID = 4423032002172540888L;

    private String name;

    private int size;

    public Dragon() {
    }

    public Dragon(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
