package behavioral.visitor.concreteElements;

import behavioral.visitor.Element;
import behavioral.visitor.Visitor;

public class Bee implements Element {
    private int serialNumber;

    public Bee(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
