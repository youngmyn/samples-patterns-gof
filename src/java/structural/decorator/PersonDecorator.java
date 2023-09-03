package structural.decorator;

public abstract class PersonDecorator implements Person{
    private Person decoratedPerson;
    public PersonDecorator(Person decoratedPerson){
        this.decoratedPerson = decoratedPerson;
    }
    @Override
    public void sayHello(){
        decoratedPerson.sayHello();
    }
    @Override
    public void introduceYourself(){
        decoratedPerson.introduceYourself();
    }
    public abstract void printFeatureOfThisDecorator();
}
