package javaImperatif;

public class Tp4 {

	public static void main(String[] args) {
		
		//4a
		float price = Float.parseFloat(args[0]);
		float sale = 0;
		
		if (price < 1000) {
			// 0%
			sale = 0;
		} else if ( (price >= 1000) && (price <= 2000) ) {
			// 1%
//			price = price + ((price * 1)/100);
			sale = (price * 1)/100;
		} else if ( (price >= 2000) && (price <= 5000) ) {
			// 3%
			sale = (price * 3)/100;
		} else if (price >= 5000 ) {
			// 5%		
			sale = (price * 5)/100;
		}
		System.out.println("prix initial " + price + " => " + sale);
		
		
		//4b
		int weight = (int) Float.parseFloat(args[1]);
		switch (weight) {
		case 1:
			System.out.println("petit");
			break;
		case 2:
			System.out.println("moyen");
			break;
		default:
			System.out.println("grand");
			break;
		}
		
		
	}

}

// Float.parseFloat(...)