package Creational.Factory.chair;

public class VictorianChair implements Chair {
    private final String variant;
    private final int noOfLegs;
    private final String material;


    public VictorianChair() {
        this.variant = "Victorian";
        this.material = "Leather";
        this.noOfLegs = 5;
        this.getChair();
    }

    public String getVariant() {
        return variant;
    }

    public String getMaterial() {
        return material;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
    @Override
    public void getChair() {
        System.out.println("Getting the " + this.variant + " chair...");
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
