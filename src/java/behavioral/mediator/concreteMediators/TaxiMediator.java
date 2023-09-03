package behavioral.mediator.concreteMediators;

import behavioral.mediator.OrderMediator;
import behavioral.mediator.TaxiPackage.Taxi;
import behavioral.mediator.TaxiPackage.TaxiStation;
import behavioral.mediator.TaxiPackage.TaxiType;

public class TaxiMediator implements OrderMediator {
    private TaxiStation station = new TaxiStation();
    public void order(Object taxiType, String from, String to){
        if(!(taxiType instanceof TaxiType)) throw new RuntimeException("Not correct behavioral.mediator");
        Taxi taxi = station.getTaxi((TaxiType) taxiType);
        taxi.driveToAddress(from);
        taxi.pickClient();
        taxi.driveToAddress(to);
    }
}
