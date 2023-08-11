package flyweight;

import flyweight.enums.Color;
import flyweight.enums.Model;

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
