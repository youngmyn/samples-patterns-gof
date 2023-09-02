package visitor.concreteElements;

import visitor.Element;
import visitor.Visitor;

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
