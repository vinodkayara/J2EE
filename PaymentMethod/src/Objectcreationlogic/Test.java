package Objectcreationlogic;

import java.util.Scanner;

import paymentimplementationlogic.Ipayment;

public class Test {

	public static void main(String[] args) {
		
			  Scanner sc=new Scanner(System.in); 
			  System.out.println("Enter the Engine Type:"); 
			  String pay=sc.next(); 
			   
			  Ipayment p=payment.getPayment(pay); 
			  //IEngine e1=new Petrol(); 
			  //IEngine e2=new Diesel(); 
			  //IEngine e3=new CNG(); 
			  if(p!=null) { 
			   p.doPayment(); 
			  } 
			 } 

	}


