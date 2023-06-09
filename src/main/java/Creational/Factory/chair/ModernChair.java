package Creational.Factory.chair;

public class ModernChair implements Chair {
    private final String variant;
    private final String fabric;


    public ModernChair() {
        this.variant = "Mordern";
        this.fabric = "Linen";
        this.getChair();
    }

    public String getVariant() {
        return variant;
    }

    public String getfabric() {
        return fabric;
    }

    public int getNoOfLegs() {
        return 0;
    }

    @Override
    public void getChair() {
        System.out.println("Getting the " + this.variant + " chair...");
    }

    @Override
    public boolean hasLegs() {
        return false;
    }
}
