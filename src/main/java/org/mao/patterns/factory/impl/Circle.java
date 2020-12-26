package org.mao.patterns.factory.impl;

import org.mao.patterns.factory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle icindeki draw methodu.");
    }
}
