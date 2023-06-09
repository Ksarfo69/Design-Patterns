package Creational.Factory.factories;

import Creational.Factory.chair.ModernChair;
import Creational.Factory.sofa.ModernSofa;
import Creational.Factory.table.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public ModernChair createChair() {
        return new ModernChair();
    }

    @Override
    public ModernSofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public ModernTable createTable() {
        return new ModernTable();
    }
}
