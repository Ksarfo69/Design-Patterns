package Creational.Factory.factories;

import Creational.Factory.chair.Chair;
import Creational.Factory.chair.VictorianChair;
import Creational.Factory.sofa.Sofa;
import Creational.Factory.sofa.VictorianSofa;
import Creational.Factory.table.Table;
import Creational.Factory.table.VictorianTable;

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
