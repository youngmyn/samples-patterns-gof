package behavioral.mediator;

import behavioral.mediator.TaxiPackage.TaxiType;
import behavioral.mediator.concreteMediators.TaxiMediator;

public class Client {
    private OrderMediator mediator;
    private String geolocation;
    private String name;

    public Client(String name, TaxiMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void order(TaxiType taxiType, String to){
        mediator.order(taxiType,geolocation,to);
    }
    public void setGeolocation(String geo){
        geolocation = geo;
    }
}
