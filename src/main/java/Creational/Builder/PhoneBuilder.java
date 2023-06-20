package Creational.Builder;

interface PhoneBuilder {
    PhoneBuilder buildOs();
    PhoneBuilder buildProcessor();
    PhoneBuilder buildScreen();
    PhoneBuilder setBattery();
    PhoneBuilder buildBiometrics();
    Phone build();
}
