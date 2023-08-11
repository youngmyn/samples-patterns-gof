package flyweight;

import flyweight.enums.*;

public class IphoneType {
    private Color color;
    private short memorySize;
    private Model model;

    public IphoneType(Color color, short memorySize, Model model) {
        this.color = color;
        this.memorySize = memorySize;
        this.model = model;
    }
}
