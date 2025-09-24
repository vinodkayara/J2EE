package paymentimplementationlogic;

public class UPI implements Ipayment {

	@Override
	public void doPayment() {
		System.out.println("Payment successful via UPI");
		
	}

}
