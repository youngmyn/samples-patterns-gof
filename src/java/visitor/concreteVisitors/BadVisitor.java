package visitor.concreteVisitors;

import visitor.*;
import visitor.concreteElements.Bee;
import visitor.concreteElements.BeeHive;
import visitor.concreteElements.Cat;
import visitor.concreteElements.Dog;

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
