package kitchenfactory;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Meal Type :");
		String meal=sc.next();
		Meal  m=Kitchen.getMeal(meal);
		if(m!=null) {
			m.serve();
		}
		
	}

}
