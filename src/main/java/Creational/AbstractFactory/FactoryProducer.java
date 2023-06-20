package Creational.AbstractFactory;

import Creational.AbstractFactory.enums.FactoryType;
import Creational.AbstractFactory.factories.ArtDecoFurnitureFactory;
import Creational.AbstractFactory.factories.FurnitureFactory;
import Creational.AbstractFactory.factories.ModernFurnitureFactory;
import Creational.AbstractFactory.factories.VictorianFurnitureFactory;

public class FactoryProducer {
    public static FurnitureFactory getFactory(FactoryType choice){
        return switch (choice)
        {
            case ART_DECO ->  new ArtDecoFurnitureFactory();
            case MORDERN ->  new ModernFurnitureFactory();
            default ->  new VictorianFurnitureFactory();
        };
//        if (choice == FactoryType.ART_DECO)
//            return new ArtDecoFurnitureFactory();
//        if (choice == FactoryType.MORDERN)
//            return new ModernFurnitureFactory();
//
//        return new VictorianFurnitureFactory();
    }
}
