package creational.abstractFactory.concreteFabrics;

import creational.abstractFactory.Coffee;
import creational.abstractFactory.CoffeeFabric;
import creational.abstractFactory.concreteCoffee.RobustCoffee;

public class IndianFabric extends CoffeeFabric {
    @Override
    protected Coffee produceCoffee() {
        return new RobustCoffee();
    }
}
