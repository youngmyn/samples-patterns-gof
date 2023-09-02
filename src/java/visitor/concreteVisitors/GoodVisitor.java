package visitor.concreteVisitors;

import visitor.*;
import visitor.concreteElements.Bee;
import visitor.concreteElements.BeeHive;
import visitor.concreteElements.Cat;
import visitor.concreteElements.Dog;

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
