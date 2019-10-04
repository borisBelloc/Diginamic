package javaImperatif;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int tab[] = { 51, 4, 20, 3 };
		boolean isChanged = true;

		while (isChanged) {
			for (int i = 0; i <= tab.length; i++) {
				for (int j = 0; j < (tab.length - 1 - i); j++) {

					if (tab[j] > tab[j + 1]) {
						int tempStock = tab[j];
						tab[j] = tab[j + 1];
						tab[j + 1] = tempStock;

						isChanged = false;

					}
					System.out.println("Tri en cours -> " + Arrays.toString(tab));
				}
			}
		}
		System.out.println("Tab sorted --> " + Arrays.toString(tab));
	}
}
