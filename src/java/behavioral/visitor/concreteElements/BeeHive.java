package behavioral.visitor.concreteElements;

import behavioral.visitor.Element;
import behavioral.visitor.Visitor;

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
