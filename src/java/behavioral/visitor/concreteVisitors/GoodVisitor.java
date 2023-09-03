package behavioral.visitor.concreteVisitors;

import behavioral.visitor.*;
import behavioral.visitor.concreteElements.Bee;
import behavioral.visitor.concreteElements.BeeHive;
import behavioral.visitor.concreteElements.Cat;
import behavioral.visitor.concreteElements.Dog;

public class GoodVisitor implements Visitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("Погладил собачку");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Погладил кошечку");
    }

    @Override
    public void visit(BeeHive beeHive) {
        System.out.println("Защитил улей от ветра");
        for(Element e: beeHive.getBees()){
            e.accept(this);
        }
    }

    @Override
    public void visit(Bee bee) {
        System.out.println("Накормил пчелу номер "+bee.getSerialNumber());
    }
}
