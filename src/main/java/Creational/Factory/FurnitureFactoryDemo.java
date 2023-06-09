package Creational.Factory;

import Creational.Factory.chair.Chair;
import Creational.Factory.enums.FactoryType;
import Creational.Factory.factories.FurnitureFactory;
import Creational.Factory.table.Table;


public class FurnitureFactoryDemo {


    public static void main(String[] args) {
        FurnitureFactory ArtDecoFurnitureFactory = FactoryProducer.getFactory(FactoryType.ART_DECO);
        FurnitureFactory ModernFurnitureFactory = FactoryProducer.getFactory(FactoryType.MORDERN);
        FurnitureFactory VictorianFurnitureFactory = FactoryProducer.getFactory(FactoryType.VICTORIAN);

        Chair artChair = ArtDecoFurnitureFactory.createChair();
        System.out.println(artChair.hasLegs());

        Chair modernChair = ModernFurnitureFactory.createChair();
        System.out.println(modernChair.hasLegs());

        Table modernTable = ModernFurnitureFactory.createTable();
        System.out.println(modernTable.hasLegs());

        Table victorianTable = VictorianFurnitureFactory.createTable();
        System.out.println(victorianTable.hasLegs());
    }
}
