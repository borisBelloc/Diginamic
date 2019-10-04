package javaImperatif;

public class Tp5 {

	public static void main(String[] args) {
		
		int choice = Integer.parseInt(args[0]);
		int counter = 0; 
		
		do {
			System.out.println(counter);
			choice--;
			counter++;
	
		} while (choice > 0);

	}

}
