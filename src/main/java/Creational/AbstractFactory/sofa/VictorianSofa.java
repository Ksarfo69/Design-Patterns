package Creational.AbstractFactory.sofa;

public class VictorianSofa implements Sofa {
    private final String variant;
    private final int noOfLegs;
    private final String fabric;

    public VictorianSofa() {
        this.variant = "Victorian";
        this.fabric = "Leather";
        this.noOfLegs = 6;
        this.getSofa();
    }

    public String getVariant() {
        return variant;
    }
    public String getfabric() {
        return fabric;
    }
    public int getNoOfLegs() {
        return noOfLegs;
    }

    @Override
    public void getSofa() {
        System.out.println("Getting the " + this.variant + " sofa...");

    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
