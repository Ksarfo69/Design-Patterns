package Creational.AbstractFactory.factories;

import Creational.AbstractFactory.chair.Chair;
import Creational.AbstractFactory.chair.VictorianChair;
import Creational.AbstractFactory.sofa.Sofa;
import Creational.AbstractFactory.sofa.VictorianSofa;
import Creational.AbstractFactory.table.Table;
import Creational.AbstractFactory.table.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
