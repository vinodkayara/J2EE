package paymentimplementationlogic;

public class Debitcard implements Ipayment{

	@Override
	public void doPayment() {
		System.out.println("Payment successful via Debit Card");
		
	}

}
