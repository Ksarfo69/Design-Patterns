package Creational.AbstractFactory.factories;

import Creational.AbstractFactory.chair.Chair;
import Creational.AbstractFactory.sofa.Sofa;
import Creational.AbstractFactory.table.Table;

public interface FurnitureFactory {
    public Chair createChair();
    public Sofa createSofa();
    public Table createTable();
    default void k()
    {
        System.out.println("Hello K");
    }
}


