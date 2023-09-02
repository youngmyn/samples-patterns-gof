package visitor;

import visitor.concreteElements.Bee;
import visitor.concreteElements.BeeHive;
import visitor.concreteElements.Cat;
import visitor.concreteElements.Dog;

public interface Visitor {
    void visit(Dog dog);

    void visit(Cat cat);
    void visit(BeeHive beeHive);
    void visit(Bee bee);
}
