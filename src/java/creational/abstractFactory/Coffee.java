package creational.abstractFactory;

public abstract class Coffee {
    private boolean isPacked;

    public boolean isPacked() {
        return isPacked;
    }

    public void setPacked(boolean packed) {
        isPacked = packed;
    }

    protected abstract void printCoffeeColor();
}
