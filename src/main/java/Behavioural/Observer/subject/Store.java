package Behavioural.Observer.subject;

import Behavioural.Observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Store implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private String storeName;

    public Store(String name) {
        this.storeName = name;
    }

    public void sendNews(String news) {
        String text = "\n" + storeName + " just sent, News: " + news;
        System.out.println(text);
        for(int i = 0; i < text.length(); ++i) System.out.print("-");
        notifySubscribers(news);
    }

    @Override
    public synchronized void addSubscriber(Observer observer) {
        observers.add(observer);
    }
    @Override
    public synchronized void removeSubscriber(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers(String news) {
        observers.forEach(observer -> observer.notify(storeName, news));
    }

    public void getObservers() {
        observers.forEach(observer -> System.out.println(observer.getName()));
    }

    public int getNumberOfObservers() {
        return observers.size();
    }

     public String getName() {
         return storeName;
     }

     public void setName(String name) {
         this.storeName = name;
     }

}