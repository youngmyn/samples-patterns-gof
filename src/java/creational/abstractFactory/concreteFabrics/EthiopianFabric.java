package creational.abstractFactory.concreteFabrics;

import creational.abstractFactory.Coffee;
import creational.abstractFactory.CoffeeFabric;
import creational.abstractFactory.concreteCoffee.ArabicCoffee;

public class EthiopianFabric extends CoffeeFabric {
    @Override
    protected Coffee produceCoffee() {
        return new ArabicCoffee();
    }
}
