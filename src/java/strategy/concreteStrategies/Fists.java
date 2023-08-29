package strategy.concreteStrategies;

import strategy.Strategy;

public class Fists implements Strategy {
    @Override
    public void attack() {
        System.out.println("I attack with my bare hands and deal 10 damage at close range");
    }
}
