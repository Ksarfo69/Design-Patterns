package Creational.Factory.factories;

import Creational.Factory.chair.Chair;
import Creational.Factory.sofa.Sofa;
import Creational.Factory.table.Table;

public interface FurnitureFactory {
    public Chair createChair();
    public Sofa createSofa();
    public Table createTable();
}


