package paymentimplementationlogic;

public class Creditcard implements Ipayment{

	@Override
	public void doPayment() {
		 System.out.println("Payment successful via Credit Card");
		
	}
	

}
