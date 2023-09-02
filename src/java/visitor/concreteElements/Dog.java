package visitor.concreteElements;

import visitor.Element;
import visitor.Visitor;

public class Dog implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
