package behavioral.chainOfResponsibility;

public interface PaymentTransactionHandler {
	void pay(int price);
	boolean canPay(int price);
	void setNext(PaymentTransactionHandler handler);
}
