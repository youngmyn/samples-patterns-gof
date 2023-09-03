package structural.decorator.concretePersons;

import structural.decorator.Person;

public class Man implements Person {
    @Override
    public void sayHello() {
        System.out.println("Hey, dude!");
    }

    @Override
    public void introduceYourself() {
        System.out.print("i am a man. ");
    }
}
