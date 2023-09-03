package behavioral.visitor.concreteVisitors;

import behavioral.visitor.*;
import behavioral.visitor.concreteElements.Bee;
import behavioral.visitor.concreteElements.BeeHive;
import behavioral.visitor.concreteElements.Cat;
import behavioral.visitor.concreteElements.Dog;

public class BadVisitor implements Visitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("Пнул собаку");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Шугнул кошку");
    }

    @Override
    public void visit(BeeHive beeHive) {
        System.out.println("Сломал улей");
        for(Element e: beeHive.getBees()){
            e.accept(this);
        }
    }

    @Override
    public void visit(Bee bee) {
        System.out.println("Раздавил пчелу номер "+bee.getSerialNumber());
    }
}
