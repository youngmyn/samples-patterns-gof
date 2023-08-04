package decorator.concreteDecorators;

import decorator.Person;
import decorator.PersonDecorator;

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
        System.out.println("It is an aggressive decorator for Person");
    }
}
