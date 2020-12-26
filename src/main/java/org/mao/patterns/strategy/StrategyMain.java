package org.mao.patterns.strategy;

import org.mao.patterns.strategy.impl.OperationAdd;
import org.mao.patterns.strategy.impl.OperationMultiply;
import org.mao.patterns.strategy.impl.OperationSubstract;

import java.text.DecimalFormat;
import java.util.Random;

public class StrategyMain {
    public static void main( String[] args )
    {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(10,5));
        context = new Context(new OperationSubstract());
        System.out.println(context.executeStrategy(10,5));
        context = new Context(new OperationMultiply());
        System.out.println(context.executeStrategy(10,5));

    }
}
