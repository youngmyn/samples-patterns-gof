package structural.decorator.concreteDecorators;

import structural.decorator.Person;
import structural.decorator.PersonDecorator;

public class NicePersonDecorator extends PersonDecorator {
    public NicePersonDecorator(Person decoratedPerson) {
        super(decoratedPerson);
    }
    @Override
    public void introduceYourself(){
        super.introduceYourself();
        System.out.print("And i'm very cute. ");
    }
    @Override
    public void printFeatureOfThisDecorator() {

    }
}
