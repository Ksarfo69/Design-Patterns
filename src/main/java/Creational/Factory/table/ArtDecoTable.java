package Creational.Factory.table;

public class ArtDecoTable implements Table {
    private final String variant;

    public ArtDecoTable() {
        variant = "ArtDeco";
        this.getTable();
    }

    public String getVariant() {
        return variant;
    }


    @Override
    public void getTable() {
        System.out.println("Getting the " + this.variant + " table...");

    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
