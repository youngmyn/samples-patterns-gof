package strategy;

import strategy.concreteStrategies.Fists;

public class Hero {
    private Strategy strategy = new Fists();
    private int health = 100;
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public void attack(){
        strategy.attack();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
