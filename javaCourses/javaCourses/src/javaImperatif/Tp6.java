package javaImperatif;

public class Tp6 {

	public static void main(String[] args) {

		int choice = Integer.parseInt(args[0]);
		int result = 1;

		for (int i = 1; i < choice+1; i++) {
			
			result *= i;
			}
		System.out.println(result);

	}

}
