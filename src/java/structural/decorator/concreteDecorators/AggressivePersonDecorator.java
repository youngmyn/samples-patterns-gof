package structural.decorator.concreteDecorators;

import structural.decorator.Person;
import structural.decorator.PersonDecorator;

public class AggressivePersonDecorator extends PersonDecorator {
    public AggressivePersonDecorator(Person decoratedPerson) {
        super(decoratedPerson);
    }
    @Override
    public void introduceYourself() {
        super.introduceYourself();
        System.out.print("And im very angry. ");
    }

    @Override
    public void printFeatureOfThisDecorator() {
        System.out.println("It is an aggressive structural.decorator for Person");
    }
}
