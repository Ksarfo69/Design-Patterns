package Creational.Factory;

import Creational.Factory.enums.FactoryType;
import Creational.Factory.factories.ArtDecoFurnitureFactory;
import Creational.Factory.factories.FurnitureFactory;
import Creational.Factory.factories.ModernFurnitureFactory;
import Creational.Factory.factories.VictorianFurnitureFactory;

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
