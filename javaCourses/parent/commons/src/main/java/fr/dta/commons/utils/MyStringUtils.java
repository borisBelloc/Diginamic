package fr.dta.commons.utils;

public class MyStringUtils {

	public static boolean isNullOrEmpty(String stringToTest) {
		return stringToTest == null || stringToTest.trim().isEmpty();
	}
}
