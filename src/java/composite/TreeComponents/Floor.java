package composite.TreeComponents;

import composite.Component;

import java.util.ArrayList;
import java.util.List;

public class Floor implements Component {
    List<Component> apartments = new ArrayList<>();
    private int number;

    public Floor(int number){
        this.number = number;
    }
    public void add(Component component){
        apartments.add(component);
    }
    @Override
    public void print() {
        System.out.println("\tFloor "+number);
        apartments.forEach(Component::print);
    }
}
