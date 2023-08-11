package flyweight;

public class Iphone {
    private int serialNumber;
    private IphoneType type;
    public Iphone(int serialNumber, IphoneType type) {
        this.serialNumber = serialNumber;
        this.type = type;
    }
    public IphoneType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", type=" + type +
                '}';
    }
}
