package abstractFactory.concreteCoffee;

import abstractFactory.Coffee;

public class RobustCoffee extends Coffee {
    @Override
    protected void printCoffeeColor() {
        System.out.println("printing the color of robust coffee...It's almost black");
    }
}
