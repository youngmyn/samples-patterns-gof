package abstractFactory;

import abstractFactory.concreteFabrics.*;
/*
Данный шаблон делегирует создание объектов наследникам родительского класса. Это позволяет использовать
в коде программы не конкретные классы, а манипулировать абстрактными объектами на более высоком уровне.
 */
public class abstractFactoryMain {
    public static void main(String[] args) {
        CoffeeFabric fabric = new IndianFabric();//можно менять Индийскую фабрику на любую другую
                                                                        //фабрику, наследующую от абстракции
        fabric.getPackedCoffee().printCoffeeColor();

        System.out.println("-----------------------------------------");

        fabric = new EthiopianFabric();
        fabric.getPackedCoffee().printCoffeeColor();
    }
}
