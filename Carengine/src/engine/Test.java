package engine;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Engine Type:");
		String engine=sc.next();
		
		IEngine e= Car.getEngine(engine);
		if(e!=null) {
			e.start();
		}
		

	}

}
