package builder;

public class Phone {
    private int memory;
    private double displayDiagonal;
    private String brand;

    public Phone() {
        super();
    }

    public Phone(int memory, double displayDiagonal, String brand) {
        this();
        this.memory = memory;
        this.displayDiagonal = displayDiagonal;
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getDisplayDiagonal() {
        return displayDiagonal;
    }

    public void setDisplayDiagonal(double displayDiagonal) {
        this.displayDiagonal = displayDiagonal;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public boolean checkQualityOfDevice(){
        return (memory!=0 && displayDiagonal!=0.0d && brand!=null && !brand.trim().isEmpty());
    }

    @Override
    public String toString() {
        return "Phone{" +
                "memory=" + memory +
                ", displayDiagonal=" + displayDiagonal +
                ", brand='" + brand + '\'' +
                '}';
    }
}
