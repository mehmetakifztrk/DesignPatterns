package org.mao.patterns.observer.impl;

import org.mao.patterns.observer.Observer;
import org.mao.patterns.observer.Subject;

import java.util.ArrayList;

public class Channel extends Subject {

    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void notifySubscribers() {
        for (Observer observer:observers){
            observer.update();
        }
    }

    @Override
    public void subscribers(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribers(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void upload(String title) {
            this.title = title;
            notifySubscribers();
    }

}
