package Objectcreationlogic;

import paymentimplementationlogic.Creditcard;
import paymentimplementationlogic.Debitcard;
import paymentimplementationlogic.Ipayment;
import paymentimplementationlogic.UPI;

public class payment {
	public static Ipayment getPayment(String en) {
		if(en.equalsIgnoreCase("Creditcard")) {
		return new Creditcard();
	}else if(en.equalsIgnoreCase("Debitcard")) {
		return new Debitcard();
	}else if(en.equalsIgnoreCase("UPI")){
		return new UPI();
	}else { 
		   System.out.println("No such engines found!"); 
		   return null; 
		   //IEngine e=null; 
		  } 

}

}