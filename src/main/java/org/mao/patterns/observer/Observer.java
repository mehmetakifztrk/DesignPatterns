package org.mao.patterns.observer;

import org.mao.patterns.observer.impl.Channel;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
