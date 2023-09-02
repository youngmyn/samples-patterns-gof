package visitor.concreteElements;

import visitor.Element;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class BeeHive implements Element {
    private List<Element> bees = new ArrayList<>();

    public void add(Bee bee){
        bees.add(bee);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public List<Element> getBees() {
        return bees;
    }
}
