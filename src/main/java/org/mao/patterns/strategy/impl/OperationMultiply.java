package org.mao.patterns.strategy.impl;

import org.mao.patterns.strategy.Strategy;

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1*num2;
    }
}
