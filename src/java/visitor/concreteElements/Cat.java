package visitor.concreteElements;

import visitor.Element;
import visitor.Visitor;

public class Cat implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
