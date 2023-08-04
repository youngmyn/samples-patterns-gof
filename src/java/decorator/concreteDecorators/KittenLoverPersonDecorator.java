package decorator.concreteDecorators;

import decorator.Person;
import decorator.PersonDecorator;

public class KittenLoverPersonDecorator extends PersonDecorator {
    public KittenLoverPersonDecorator(Person decoratedPerson) {
        super(decoratedPerson);
    }
    @Override
    public void introduceYourself(){
        super.introduceYourself();
        System.out.print("I love kittens.");
    }

    @Override
    public void printFeatureOfThisDecorator() {
        System.out.println("It is a decorator for Person who loves kittens");
    }
}
