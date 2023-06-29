package Creational.AbstractFactory.factories;

import Creational.AbstractFactory.chair.ArtDecoChair;
import Creational.AbstractFactory.sofa.ArtDecoSofa;
import Creational.AbstractFactory.table.ArtDecoTable;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public ArtDecoChair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public ArtDecoSofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public ArtDecoTable createTable() {
        return new ArtDecoTable();
    }

    @Override
    public void k() {
        System.out.println("Kofi");
    }

    public static void main(String[] args) {
        ArtDecoFurnitureFactory a = new ArtDecoFurnitureFactory();
        a.k();
    }
}
