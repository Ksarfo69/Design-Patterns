package Creational.AbstractFactory.sofa;

public class ModernSofa implements Sofa {

    private final String variant;
    private final String fabric;

    public String getfabric() {
        return fabric;
    }

    public ModernSofa() {
        this.variant = "Modern";
        this.fabric= "Linen";
        this.getSofa();
    }

    public int getNoOfLegs() {
        return 0;
    }

    public String getVariant() {
        return variant;
    }

    @Override
    public void getSofa() {
        System.out.println("Getting the " + this.variant + " sofa...");
    }

    @Override
    public boolean hasLegs() {
        return false;
    }
}
