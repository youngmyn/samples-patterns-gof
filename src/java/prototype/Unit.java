package prototype;

import prototype.enums.UnitType;

public abstract class Unit implements Prototype{
    private int health;
    private UnitType type;

    public Unit(int health, UnitType type){
        super();
        this.health = health;
        this.type = type;
    }
    public Unit(Unit unit){
        super();
        this.health = unit.health;
        this.type = unit.type;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public UnitType getType() {
        return type;
    }
    public abstract void move();
    public abstract void attack(Unit enemy);
}
