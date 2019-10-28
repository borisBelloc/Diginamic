package utils;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyUtilsTest {

	private static MyUtils myUtils;

	@BeforeClass
	public static void init() {
		myUtils = new MyUtils();
	}

	@Test
	public void testSum_classic() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);

		assertEquals(9, myUtils.sum(list));
	}

	@Test
	public void testSum_withNull() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(null);
		list.add(5);

//        System.out.println("list de test " + list);
		assertEquals(9, myUtils.sum(list));
	}

	// --------------------- EX 2

	@Test
	public void testEmptyToNull_classic() {
		assertEquals("Salut", myUtils.emptyToNull("Salut"));
	}

	@Test
	public void testEmptyToNull_stringNull() {
		assertEquals(null, myUtils.emptyToNull(null));
	}
	@Test
	public void testEmptyToNull_stringEmpty() {
		assertEquals(null, myUtils.emptyToNull("   "));
	}
	
	// --------------------- EX 3
	
	@Test
	public void testFilterEvenNumbers() {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(12);
		

        List<Integer> listFiltered = Arrays.asList(4, 12);
        
        assertEquals(listFiltered, myUtils.filterEvenNumbers(list));       
		
	}
	
	@Test
	public void testFilterEvenNumbers_withNull() {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(3);
		list.add(null);
		list.add(5);
		list.add(12);
		
        List<Integer> listFiltered = Arrays.asList(4, 12);
        
        assertEquals(listFiltered, myUtils.filterEvenNumbers(list));       
	}
	
	@Test
	public void testTransformSquarePlusPointFive() {
        List<Integer> listIni = Arrays.asList(3, 4, 12);
        List<Float> listTransformed = Arrays.asList(9.5f, 16.5f, 144.5f);
        
        assertEquals(listTransformed, myUtils.transformSquarePlusPointFive(listIni));     
	}
	
	

}
