package behavioral.chainOfResponsibility.concreteHandlers;

import behavioral.chainOfResponsibility.AbstractPaymentSystem;

public class Qiwi extends AbstractPaymentSystem {
	public Qiwi(int b) {
		super(b);
	}
	public void payToSteamAccount(String steamURI, int value) {
		// some code
	}
}
