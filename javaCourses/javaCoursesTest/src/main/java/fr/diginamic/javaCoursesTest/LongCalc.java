package fr.diginamic.javaCoursesTest;

public class LongCalc {
	
//	public static long doAddition(Long a, Long b) {
//		return (a + b);
//	}
//	
	
	// si nombre inferieur a 0 -> doit lever exeption
	// si nombre null -> doit devenir 0
	
	
	public long doSubstraction(Long a, Long b) throws NegativeNumberException {
		
		a = a == null ? 0 : a;
		b = b == null ? 0 : b;
		
		
		
		if (a < 0 || b < 0 || a < b) {
			throw new NegativeNumberException();
		}
		
		return (a - b);
	}

}
