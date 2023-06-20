package Creational.Builder;

public class PhoneDemo {

    public static void main(String[] args) {
        Phone iPhone = new IPhone()
                .buildOs()
                .buildProcessor()
                .build();

        Phone androidPhone = new Android()
                .buildOs()
                .buildProcessor()
                .buildScreen()
                .build();


        System.out.println(iPhone);
        System.out.println(androidPhone);


    }
}
