package Creational.Builder;

public class Phone {
    private String os;
    private String processor;
    private String screenType;
    private int battery;
    private boolean hasFaceId;
    private boolean hasFingerprint;

    private String phoneCase;

    public void setOs(String os) {
        this.os = os;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setHasFaceId(boolean hasFaceId) {
        this.hasFaceId = hasFaceId;
    }

    public void setHasFingerprint(boolean hasFingerprint) {
        this.hasFingerprint = hasFingerprint;
    }

    @Override
    public String toString() {
        return "original.Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", screenType='" + screenType + '\'' +
                ", battery=" + battery +
                ", hasFaceId=" + hasFaceId +
                ", hasFingerprint=" + hasFingerprint +
                '}';
    }
}
