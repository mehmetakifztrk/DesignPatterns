package org.mao.patterns.factory;

public class ShapeFactory {
    public static Shape createShape(Class aClass) throws IllegalAccessException, InstantiationException {
        return (Shape) aClass.newInstance();
    }
}
