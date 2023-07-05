package Behavioural.Observer.observer;

public interface Observer {
    void notify(String handle, String news);
    String getName();
}
