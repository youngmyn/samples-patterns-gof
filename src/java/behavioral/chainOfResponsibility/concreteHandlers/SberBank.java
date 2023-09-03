package behavioral.chainOfResponsibility.concreteHandlers;

import behavioral.chainOfResponsibility.AbstractPaymentSystem;

public class SberBank extends AbstractPaymentSystem {
    public SberBank(int b) {
        super(b);
    }
    public void payWithSberSpasiboBonuses(String value){
        //some code
    }
}
