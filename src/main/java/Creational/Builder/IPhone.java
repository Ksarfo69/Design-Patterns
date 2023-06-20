package Creational.Builder;

public class IPhone extends Phone implements PhoneBuilder
{
    @Override
    public IPhone buildOs() {
        this.setOs("iOS 16");
        return this;
    }

    @Override
    public IPhone buildProcessor() {
        this.setProcessor("AMD Core i5");
        return this;
    }

    @Override
    public IPhone buildScreen() {
        this.setScreenType("AMOLED");
        return this;
    }

    @Override
    public IPhone setBattery() {
        this.setBattery(4000);
        return this;
    }

    @Override
    public IPhone buildBiometrics() {
        this.setHasFaceId(true);
        this.setHasFingerprint(false);
        return this;
    }

    @Override
    public IPhone build() {
        return this;
    }
}
