package strategy.concreteStrategies;

import strategy.Strategy;

public class Firearm implements Strategy {
    @Override
    public void attack() {
        System.out.println("I attack with a pistol and deal 10 damage from a long distance");
    }
}
