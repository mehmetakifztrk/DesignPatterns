package org.mao.patterns.observer.impl;

import org.mao.patterns.observer.Observer;
import org.mao.patterns.observer.Subject;

public class Subscriber extends Observer {

    private String name;

    public Subscriber(Subject subject, String name){
        this.name = name;
        this.subject = subject;
        this.subject.subscribers(this);
    }

    @Override
    public void update() {
        System.out.println("Hey "+name+", Video Uploaded \""+ this.subject.title+"\"");
    }
}
