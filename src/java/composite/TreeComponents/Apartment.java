package composite.TreeComponents;

import composite.Component;

import java.util.ArrayList;
import java.util.List;

public class Apartment implements Component {
    private List<Component> rooms = new ArrayList<>();
    private int number;

    public Apartment(int number) {
        this.number = number;
    }
    public void add(Component component){
        rooms.add(component);
    }
    @Override
    public void print() {
        System.out.println("\t\tApartment "+number+":");
        rooms.forEach(Component::print);
    }
}
