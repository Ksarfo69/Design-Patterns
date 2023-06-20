package Creational.Builder;

public class Android extends Phone implements PhoneBuilder
{
    @Override
    public Android buildOs() {
        this.setOs("Android 12");
        return this;
    }

    @Override
    public Android buildProcessor() {
        this.setProcessor("Quallcom Octa Core");
        return this;
    }

    @Override
    public Android buildScreen() {
        this.setScreenType("Corning Gorilla");
        return this;
    }

    @Override
    public Android setBattery() {
        this.setBattery(5000);
        return this;
    }

    @Override
    public Android buildBiometrics() {
        this.setHasFaceId(false);
        this.setHasFingerprint(true);
        return this;
    }

    @Override
    public Android build() {
        return this;
    }
}
