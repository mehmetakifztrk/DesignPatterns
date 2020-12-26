package org.mao.patterns.factory.impl;

import org.mao.patterns.factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square icindeki draw methodu.");
    }
}
