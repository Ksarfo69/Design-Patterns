package Creational.Factory.table;

public class VictorianTable implements Table {
    private String variant;

    public VictorianTable() {
        this.variant = "Victorian";
        this.getTable();
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
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
