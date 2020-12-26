package org.mao.patterns.factory.impl;

import org.mao.patterns.factory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle icindeki draw methodu.");
    }
}
