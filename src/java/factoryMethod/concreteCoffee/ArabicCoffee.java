package factoryMethod.concreteCoffee;

import factoryMethod.Coffee;

public class ArabicCoffee extends Coffee {
    @Override
    protected void printCoffeeColor() {
        System.out.println("printing the color of arabic coffee...It's brown");
    }
}
