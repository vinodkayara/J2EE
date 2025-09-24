package engine;

public class Car {

	public static IEngine getEngine(String eng) {
		if(eng.equalsIgnoreCase("Petrol")) {
			return new Petrol();
		}else if(eng.equalsIgnoreCase("Diesel")) {
			return new Diesel();
		}
		else if(eng.equalsIgnoreCase("CNG")) {
			return new CNG();
		}else {
			System.out.println("No such engines found!");
			return null;
		}

	}
}
