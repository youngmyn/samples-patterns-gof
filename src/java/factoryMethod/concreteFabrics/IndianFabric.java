package factoryMethod.concreteFabrics;

import factoryMethod.Coffee;
import factoryMethod.CoffeeFabric;
import factoryMethod.concreteCoffee.RobustCoffee;

public class IndianFabric extends CoffeeFabric {
    @Override
    protected Coffee produceCoffee() {
        return new RobustCoffee();
    }
}
