package javaImperatif;

public class Tp7 {

	/**
	 * Display the n prime number asked by user
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

//		int choice = Integer.parseInt(args[0]);
//
//		for (int i = 0; i < choice; i++) {
//			
//			if (isPrime(i)) {
//				System.out.println(i);
//			}
//		}
//		
//		
		
		
		isPrime(12);
		
		
// TODO: finir tp 7
		
	}

	
	
	
	/**
	 * Is it a prime number
	 * 
	 * @param numberChoosen : argument to check
	 * @return true or false
	 */
	public static boolean isPrime(int numberChoosen) {

		if (numberChoosen > 1) {
			// prime number start at 2
			for (int i = 2; i < numberChoosen - 1; i++) {
				// not a prime number, can be divided by something else
				if (numberChoosen % i == 0) {
					System.out.println("NON");
					return false;
				}
			}
			System.out.println("oui");
			return true;
		} else
			// prime number start at 2
			System.out.println("non; <2 ");
		return false;
	}
	
	

}
