package factoryMethod.concreteFabrics;

import factoryMethod.Coffee;
import factoryMethod.CoffeeFabric;
import factoryMethod.concreteCoffee.ArabicCoffee;

public class EthiopianFabric extends CoffeeFabric {
    @Override
    protected Coffee produceCoffee() {
        return new ArabicCoffee();
    }
}
