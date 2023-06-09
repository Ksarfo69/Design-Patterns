package Creational.Factory.table;

public class ModernTable implements Table {

    private String variant;

    public ModernTable() {
        variant = "Modern";
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
