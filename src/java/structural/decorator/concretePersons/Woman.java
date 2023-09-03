package structural.decorator.concretePersons;

import structural.decorator.Person;

public class Woman implements Person {
    @Override
    public void sayHello() {
        System.out.println("Hello! Very glad to see you!!!");
    }

    @Override
    public void introduceYourself() {
        System.out.print("i am a woman. ");
    }
}
