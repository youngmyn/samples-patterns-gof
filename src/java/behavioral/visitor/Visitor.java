package behavioral.visitor;

import behavioral.visitor.concreteElements.Bee;
import behavioral.visitor.concreteElements.BeeHive;
import behavioral.visitor.concreteElements.Cat;
import behavioral.visitor.concreteElements.Dog;

public interface Visitor {
    void visit(Dog dog);

    void visit(Cat cat);
    void visit(BeeHive beeHive);
    void visit(Bee bee);
}
