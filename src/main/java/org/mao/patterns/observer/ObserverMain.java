package org.mao.patterns.observer;

import org.mao.patterns.observer.impl.Channel;
import org.mao.patterns.observer.impl.Subscriber;

public class ObserverMain {
    public static void main(String[] args) {
        Channel channel = new Channel();
        Subscriber subscriber1 = new Subscriber(channel,"Akif");
        Subscriber subscriber2 = new Subscriber(channel,"Abdullah");
        Subscriber subscriber3 = new Subscriber(channel,"Ali");
        Subscriber subscriber4 = new Subscriber(channel,"Nuray");
        channel.upload("Observer Design Pattern in Java");
    }
}
