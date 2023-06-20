package Creational.AbstractFactory.sofa;

public class ArtDecoSofa implements Sofa {
    private final String variant;
    private int noOfLegs;
    private final String fabric;


    public ArtDecoSofa() {
        this.variant = "ArtDeco";
        this.fabric = "Cotton";
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
