package javaImperatif;

public class Tp2 {

	public static void main(String[] args) {

		//1
		int firstInt = 1234;
		System.out.println("first INT : " + firstInt);
		float firstFloat = firstInt;
		System.out.println("first FLOAT : " + firstFloat);
		
		int secondInt = 123456789;
		System.out.println("Second INT : " + secondInt);
		float secondFloat = secondInt;
		System.out.println("Second FLOAT : " + secondFloat);
		
		System.out.println("-------------------------------");
		//2
		float x = 15f;
		System.out.println(x);
		float z = 0f;
		System.out.println(z);
		float y = -123f;
		System.out.println(y);
		float a = x/z;
		System.out.println(a);
		float b = y/z;
		System.out.println(b);
		float c = a/b;
		System.out.println(c);
	}

}
