package Creational.AbstractFactory.factories;

import Creational.AbstractFactory.chair.ModernChair;
import Creational.AbstractFactory.sofa.ModernSofa;
import Creational.AbstractFactory.table.ModernTable;

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
