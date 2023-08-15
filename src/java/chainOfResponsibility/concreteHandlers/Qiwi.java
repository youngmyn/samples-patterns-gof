package chainOfResponsibility.concreteHandlers;

import chainOfResponsibility.AbstractPaymentSystem;

public class Qiwi extends AbstractPaymentSystem {
    public Qiwi(int b) {
        super(b);
    }
    public void payToSteamAccount(String steamURI, int value){
        //some code
    }
}
