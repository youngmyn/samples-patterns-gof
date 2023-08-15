package chainOfResponsibility.concreteHandlers;

import chainOfResponsibility.AbstractPaymentSystem;

public class TinkoffBank extends AbstractPaymentSystem {
    private int cashback;
    public TinkoffBank(int b) {
        super(b);
    }
    public int getCashbackBalance(){
        return cashback;
    }
}
