package com.learn.neko.bean;

import java.io.Serializable;

/**
 * @author NekoChips
 * @description Car
 * @date 2020/4/17
 */
public class Car implements Serializable {
    
    private static final long serialVersionUID = 136242051382122048L;

    private String color;

    private int size;

    public Car() {
    }

    public Car(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
