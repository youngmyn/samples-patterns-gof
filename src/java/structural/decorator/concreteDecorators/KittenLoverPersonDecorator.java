package structural.decorator.concreteDecorators;

import structural.decorator.Person;
import structural.decorator.PersonDecorator;

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
        System.out.println("It is a structural.decorator for Person who loves kittens");
    }
}
