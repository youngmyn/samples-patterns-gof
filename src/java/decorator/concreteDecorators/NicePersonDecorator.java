package decorator.concreteDecorators;

import decorator.Person;
import decorator.PersonDecorator;

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
