package structural.flyweight;

import structural.flyweight.enums.Color;
import structural.flyweight.enums.Model;

public class IphoneWithoutFlyweight {
    private int serialNumber;
    private Color color;
    private short memorySize;
    private Model model;

    public IphoneWithoutFlyweight(int serialNumber, Color color, short memorySize, Model model) {
        this.serialNumber = serialNumber;
        this.color = color;
        this.memorySize = memorySize;
        this.model = model;
    }
}
