package mediator.TaxiPackage;

public abstract class Taxi {
    private String carNumber;
    private TaxiType type;
    public Taxi(TaxiType type, String carNumber) {
        this.type = type;
        this.carNumber = carNumber;
    }
    public String getCarNumber(){
        return carNumber;
    }
    public abstract void pickClient();

    public abstract void driveToAddress(String address);
}
