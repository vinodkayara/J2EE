package kitchenfactory;

public class Kitchen {
	public static Meal getMeal(String eng) {
		if(eng.equalsIgnoreCase("Breakfast")) {
			return new Breakfast();
		}
		else if(eng.equalsIgnoreCase("Lunch")) {
			return new Lunch();
		}else if(eng.equalsIgnoreCase("Dinner")) {
			return new Dinner();
		}else {
			System.out.println("Not prepared");
			return null;
		}
	}

}
