import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import fr.diginamic.javaCoursesTest.LongCalc;
import fr.diginamic.javaCoursesTest.NegativeNumberException;

public class CalculTest {

//	@Test
//	public void testDoAddition() {
////		fail("Not yet implemented");
//	assertEquals(6, Calcul.doAddition(3L, 3L));
//	}
	
	
	private static LongCalc calc;
	
	@BeforeClass
	public static void init() {
		calc = new LongCalc();
	}
	
	

	@Test
	public void testDoSubstraction_WithNullA() {
		Long result = calc.doSubstraction(null, 0L);
		
		assertEquals(new Long(0L), result);
		
	}
	@Test
	public void testDoSubstraction_WithNullB() {
		Long result = calc.doSubstraction(12L, null);
		
		assertEquals(new Long(12L), result);
	}
	@Test
	public void testDoSubstraction_WithNullAAndB() {
		Long result = calc.doSubstraction(null, null);
		
		assertEquals(new Long(0L), result);
	}
	
	
	// equivalent aux test ci-dessous "vieille méthode"
	
	@Test 
	public void testDoSubstraction_WithNegativeA() {
		try {
			calc.doSubstraction(-2L,  5L);
		} catch (NegativeNumberException nne) {
			return;
		}
		fail("Should have thrown NegativeNumberException");
		

	}
	
	// meilleur facon de faire si exception attendue
	
	@Test (expected = NegativeNumberException.class)
	public void testDoSubstraction_WithNegativeB() {
		calc.doSubstraction(50L, -5L);
	}
	
	@Test (expected = NegativeNumberException.class)
	public void testDoSubstraction_WithNegativeAAndB() {
		calc.doSubstraction(-50L, -5L);
	}
	
	@Test (expected = NegativeNumberException.class)
	public void testSubstract_NegativeResult() {
		calc.doSubstraction(304L, 530L);
	}
		
	@Test
	public void testSubstract_Limit() {
		Long result = calc.doSubstraction(12898L, 12898L);
		
		assertEquals(new Long(0L), result);
	}

  
	
}
