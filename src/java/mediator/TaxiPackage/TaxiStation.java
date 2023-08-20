package mediator.TaxiPackage;

import mediator.TaxiPackage.concreteTaxis.BusinessTaxi;
import mediator.TaxiPackage.concreteTaxis.EconomyTaxi;

public class TaxiStation {
    private int number = 0;
    public Taxi getTaxi(TaxiType taxiType){
        number++;
        switch (taxiType){
            case BUSINESS:
                return new BusinessTaxi(TaxiType.BUSINESS,String.format("%05d+BB",number));
            case ECONOMY:
                return new EconomyTaxi(TaxiType.ECONOMY,String.format("%05d+EE",number));
        }
        throw new RuntimeException("no existing type");
    }
}
