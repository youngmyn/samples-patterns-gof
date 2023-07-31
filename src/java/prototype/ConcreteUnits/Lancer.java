package prototype.ConcreteUnits;

import prototype.Unit;
import prototype.enums.UnitType;

public class Lancer extends Unit {
    public Lancer(int health) {
        super(health,UnitType.LANCER);
    }
    private Lancer(Lancer lancer){
        super(lancer);
    }

    @Override
    public Lancer copy() {
        return new Lancer(this);
    }

    @Override
    public void move() {
        System.out.println("Lancer is moving");
    }

    @Override
    public String toString() {
        return "Lancer! Health: "+ getHealth();
    }

    @Override
    public void attack(Unit enemy) {
        System.out.println("Lancer attacks!!!(by his spear)");
        enemy.setHealth(enemy.getHealth()-2);
    }
}
