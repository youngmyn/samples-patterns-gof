package behavioral.chainOfResponsibility;

public abstract class AbstractPaymentSystem implements PaymentTransactionHandler {
	int balance;
	private PaymentTransactionHandler next;
	public AbstractPaymentSystem(int b) {
		super();
		balance = b;
	}
	@Override
	public void pay(int price) {
		if (canPay(price)) {
			balance -= price;
			System.out.println("Payed " + price + " from " + this.getClass().getSimpleName() + ". Balance: " + balance);
		} else if (next != null) {
			next.pay(price);
		} else {
			System.out.println("Can't pay, not enough money in your accounts");
		}
	}

	@Override
	public boolean canPay(int price) {
		return balance >= price;
	}

	@Override
	public void setNext(PaymentTransactionHandler handler) {
		next = handler;
	}
}
