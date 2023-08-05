package composite.TreeComponents;

import composite.Component;

import java.util.ArrayList;
import java.util.List;

public class House implements Component {
    private List<Component> floors = new ArrayList<>();
    private String name;
    public House(String name){
        this.name = name;
    }
    public void add(Component component){
        floors.add(component);
    }
    @Override
    public void print() {
        System.out.println(name +" :");
        floors.forEach(Component::print);
    }
}
