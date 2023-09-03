package behavioral.visitor.concreteElements;

import behavioral.visitor.Element;
import behavioral.visitor.Visitor;

public class Cat implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
