package abstractFactory.concreteFabrics;

import abstractFactory.Coffee;
import abstractFactory.CoffeeFabric;
import abstractFactory.concreteCoffee.RobustCoffee;

public class IndianFabric extends CoffeeFabric {
    @Override
    protected Coffee produceCoffee() {
        return new RobustCoffee();
    }
}
