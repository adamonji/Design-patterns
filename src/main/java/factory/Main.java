package factory;

import factory.units.Factory;
import factory.units.Unit;
import factory.units.UnitFactory;
import factory.units.UnitType;

public class Main {
    public static void main(String[] args) {
        Factory factory = new UnitFactory();
        Unit tiger5 = factory.createUnit(UnitType.TANK);
        Unit soldier6 = factory.createUnit(UnitType.RIFLEMAN);

        System.out.println("Tiger5 " + tiger5);
        System.out.println();
        System.out.println("Soldier6 " + soldier6);


    }
}
