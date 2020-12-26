package org.mao.patterns.factory;

import org.mao.patterns.factory.impl.Circle;
import org.mao.patterns.factory.impl.Rectangle;
import org.mao.patterns.factory.impl.Square;
import org.mao.patterns.observer.impl.Channel;
import org.mao.patterns.observer.impl.Subscriber;

public class FactoryMain {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Rectangle rectangle = (Rectangle) ShapeFactory.createShape(Rectangle.class);
        rectangle.draw();
        Circle circle = (Circle) ShapeFactory.createShape(Circle.class);
        circle.draw();
        Square square = (Square) ShapeFactory.createShape(Square.class);
        square.draw();
    }
}
