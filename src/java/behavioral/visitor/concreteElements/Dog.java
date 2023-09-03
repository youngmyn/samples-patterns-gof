package behavioral.visitor.concreteElements;

import behavioral.visitor.Element;
import behavioral.visitor.Visitor;

public class Dog implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
