package abstractFactory.concreteFabrics;

import abstractFactory.Coffee;
import abstractFactory.CoffeeFabric;
import abstractFactory.concreteCoffee.ArabicCoffee;

public class EthiopianFabric extends CoffeeFabric {
    @Override
    protected Coffee produceCoffee() {
        return new ArabicCoffee();
    }
}
