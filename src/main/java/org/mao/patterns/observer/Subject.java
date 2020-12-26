package org.mao.patterns.observer;

public abstract class Subject {
    public abstract void notifySubscribers();
    public abstract void subscribers(Observer observer);
    public abstract void unSubscribers(Observer observer);
    public abstract void upload(String s);
    public String title;
}
