package Behavioural.Observer;

import Behavioural.Observer.observer.Subscriber;
import Behavioural.Observer.subject.Store;

public class Demo {
    public static void main(String args[]) {

        // create a new store
        Store woyramJoint = new Store("Woyram's Joint");

        // create new subscribers
        Subscriber s1 = new Subscriber("Viki");
        Subscriber s2 = new Subscriber("Rachel");
        Subscriber s3 = new Subscriber("Felix");

        // add subscribers to a particular store
        woyramJoint.addSubscriber(s1);
        woyramJoint.addSubscriber(s2);
        woyramJoint.addSubscriber(s3);

        // send news to subscribed members
        woyramJoint.sendNews("I am in now.");

        // remove subscriber
        woyramJoint.removeSubscriber(s2);

        // send news to subscribed members to ensure a member has been removed
        woyramJoint.sendNews("The place is less crowded.");

        //woyram_joint.getObservers();

        /*
        // create a new store
        Store vestir_mart = new Store("Vestir Mart");

        // create new subscribers
        Subscriber vm_s1 = new Subscriber("Isaac", "233512342222");
        Subscriber vm_s2 = new Subscriber("Alice");

        // add subscribers to a particular store
        vestir_mart.addSubscriber(vm_s1);
        vestir_mart.addSubscriber(vm_s2);

        // send news to subscribed members
        vestir_mart.sendNews("2 in 1 keyboard combo with LED backlit going for GHS 95.00");
        */
    }
}
