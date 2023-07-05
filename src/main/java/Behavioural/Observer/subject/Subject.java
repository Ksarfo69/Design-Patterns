package Behavioural.Observer.subject;

import Behavioural.Observer.observer.Observer;

public interface Subject {
    void addSubscriber(Observer observer);
    void removeSubscriber(Observer observer);
    void notifySubscribers(String email);
}
