package Creational.Factory.chair;

public class ArtDecoChair implements Chair {
    private final String variant;
    private final int noOfLegs;
    private final String fabric;

    public ArtDecoChair() {
        this.variant = "ArtDeco";
        this.fabric = "Cotton";
        this.noOfLegs = 5;
        this.getChair();
    }

    public String getVariant() {
        return variant;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public String getfabric() {
        return fabric;
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
