package mediator.concreteMediators;

import mediator.OrderMediator;
import mediator.TaxiPackage.Taxi;
import mediator.TaxiPackage.TaxiStation;
import mediator.TaxiPackage.TaxiType;

public class TaxiMediator implements OrderMediator {
    private TaxiStation station = new TaxiStation();
    public void order(Object taxiType, String from, String to){
        if(!(taxiType instanceof TaxiType)) throw new RuntimeException("Not correct mediator");
        Taxi taxi = station.getTaxi((TaxiType) taxiType);
        taxi.driveToAddress(from);
        taxi.pickClient();
        taxi.driveToAddress(to);
    }
}
