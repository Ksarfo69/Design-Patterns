package Behavioural.Observer.observer;

public class Subscriber implements Observer {
    protected String name;
    protected String phoneNumber;
    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notify(String storeName, String news) {
        System.out.printf("\n%s received news \n FROM: %s \n NEWS: %s\n\n", this.name, storeName, news);
    }

    public String getName() {
        return name;
    }
}
