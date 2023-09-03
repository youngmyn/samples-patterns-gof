package structural.composite.TreeComponents;

import structural.composite.Component;

public class Room implements Component {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("\t\t\t"+name);
    }
}
