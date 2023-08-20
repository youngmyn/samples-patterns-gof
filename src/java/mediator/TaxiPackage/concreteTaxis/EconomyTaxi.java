package mediator.TaxiPackage.concreteTaxis;

import mediator.TaxiPackage.Taxi;
import mediator.TaxiPackage.TaxiType;

public class EconomyTaxi extends Taxi {
    public EconomyTaxi(TaxiType type, String carNumber) {
        super(type,carNumber);
    }

    @Override
    public void pickClient() {
        System.out.println("Picking the client...");
    }

    @Override
    public void driveToAddress(String address) {
        System.out.println("Driving economy taxi to address: "+address);
    }

}
