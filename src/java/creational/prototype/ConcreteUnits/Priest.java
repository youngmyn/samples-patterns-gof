package creational.prototype.ConcreteUnits;

import creational.prototype.Unit;
import creational.prototype.enums.UnitType;

public class Priest extends Unit {
    private int healingCharges;
    private Priest(Priest priest) {
        super(priest);
        this.healingCharges = priest.healingCharges;

    }
    public Priest(int health, int healingCharges){
        super(health, UnitType.PRIEST);
        this.healingCharges = healingCharges;
    }

    public void selfHeal(){
        if(healingCharges<=0) return;
        if(getHealth()==3) return;
        System.out.println("Priest healing himself for 1 point of health");
        healingCharges--;
        setHealth(getHealth()+1);
    }
    @Override
    public Priest copy() {
        return new Priest(this);
    }

    @Override
    public String toString() {
        return "Priest{ Health: "+getHealth() +
                " healingCharges=" + healingCharges +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Priest is moving!");
    }
    @Override
    public void attack(Unit enemy) {
        System.out.println("Priest is attacking(by his large golden cross XD)!");
        enemy.setHealth(enemy.getHealth()-1);
    }
}
