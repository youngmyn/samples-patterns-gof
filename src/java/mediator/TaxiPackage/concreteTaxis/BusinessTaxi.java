package mediator.TaxiPackage.concreteTaxis;

import mediator.TaxiPackage.Taxi;
import mediator.TaxiPackage.TaxiType;

public class BusinessTaxi extends Taxi {
    public BusinessTaxi(TaxiType type,String carNumber) {
        super(type,carNumber);
    }

    @Override
    public void pickClient() {
        System.out.println("Opening the door, picking the client...");
    }
    @Override
    public void driveToAddress(String address) {
        System.out.println("Driving business comfort+ taxi to address: "+address);
    }
    public void giveWater(){
        System.out.println("Take your water, please");
    }
}
