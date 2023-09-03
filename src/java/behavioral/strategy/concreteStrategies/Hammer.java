package behavioral.strategy.concreteStrategies;

import behavioral.strategy.Strategy;

public class Hammer implements Strategy {
    @Override
    public void attack() {
        System.out.println("I attack with a hammer and deal 25 damage at close range");
    }
}
