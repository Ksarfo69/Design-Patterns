package Creational.Factory.factories;

import Creational.Factory.chair.ArtDecoChair;
import Creational.Factory.sofa.ArtDecoSofa;
import Creational.Factory.table.ArtDecoTable;

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
}
