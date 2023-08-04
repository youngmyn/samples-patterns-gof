package decorator.concretePersons;

import decorator.Person;

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
