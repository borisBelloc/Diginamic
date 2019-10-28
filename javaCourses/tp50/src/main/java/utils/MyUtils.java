package utils;

import java.util.ArrayList;
import java.util.List;

public class MyUtils {

	/**
	 * Retourne somme des éléments de list
	 * 
	 * @param list
	 * @return
	 * @author BELLOC Boris
	 */
	public int sum(List<Integer> list) {
		int total = 0;
		for (Integer i : list) {
			i = i == null ? 0 : i;
			total += i;
		}
		return total;
	}

	/**
	 * Retourne null si s est vide, sinon retourne s
	 * 
	 * @param s
	 * @return
	 */
	public String emptyToNull(String s) {
		if (s == null || s.trim().isEmpty()) {
			return null;
		} else {
			return s;
		}

	}

	/**
	 * Retourne les nombres pairs de la liste
	 * 
	 * @param integers
	 * @return
	 */
	public List<Integer> filterEvenNumbers(List<Integer> integers) {

		List<Integer> filtered = new ArrayList<>();

		for (Integer i : integers) {
			if (i != null) {
				if (i % 2 == 0) {
					filtered.add(i);
				}
			}
		}
		return filtered;
	}
	
	
	/**
	 * Elève au carré et additionne 0.5
	 * @param integers
	 * @return
	 */
	public List<Float> transformSquarePlusPointFive(List<Integer> integers) {
		List<Float> transformed = new ArrayList<>();
		float temp;
		
		for (Integer i : integers) {
			temp = ((i * i) + 0.5f);
			transformed.add(temp);
		}
		
//		for (float i : transformed) {
//			System.out.println("i -> " + i);
//		}
		
		return transformed;
		
	}

}
